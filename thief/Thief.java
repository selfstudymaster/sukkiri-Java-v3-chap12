package thief;

import character.Character;
import matango.Matango;
import monster.Monster;

// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-05
//public class Thief extends Character {
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に7ポイントのダメージをあたえた！");
//        m.hp -= 7;
//    }
//}

// code12-09
public class Thief extends Character {
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に7ポイントのダメージをあたえた！");
        m.hp -= 7;
    }
}
