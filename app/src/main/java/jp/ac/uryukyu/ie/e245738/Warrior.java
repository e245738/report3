package jp.ac.uryukyu.ie.e245738;

public class Warrior extends Hero {
    public Warrior(String name,int hitPoint,int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (isDead()) {
            return;
        }
        int damege = (int)(getAttack() * 1.5);
        System.out.printf("%sの攻撃！ウェポンスキル発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damege);
        opponent.wounded(damege);
    }
}
