package jp.ac.uryukyu.ie.e245738;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy (String name, int hitPoint, int damege) {
        super(name, hitPoint, damege);
    }

    @Override 
    public void wounded(int damege) {
        setHitPoint(getHitPoint()- damege);
        if ( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", getName());
        }
    }

}