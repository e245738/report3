package jp.ac.uryukyu.ie.e245738;

public class LivingThing {
    private String name;
    int hitPoint;
    private int attack;
    private boolean dead;

    LivingThing(String name,int hitPoint,int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void attack(LivingThing opponent) {
        if (dead) {
            return;
        }
        int damege = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damege);
        opponent.wounded(damege);
    }

    public void wounded(int damege) {
        hitPoint -= damege;
        if ( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
