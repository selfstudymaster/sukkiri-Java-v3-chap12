package hero;

import character.Character;
import matango.Matango;
import goblin.Goblin;
import monster.Monster;

// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-05
//public class Hero extends Character {
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に10ポイントのダメージをあたえた！");
//        m.hp -= 10;
//    }
//}

// code12-8
//public class Hero extends Character {
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に10ポイントのダメージをあたえた！");
//        m.hp -= 10;
//    }
//    public void attack(Goblin g) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に10ポイントのダメージをあたえた！");
//        g.hp -= 10;
//    }
//    // 以下スライムようなどと続く
//}

// code12-9
public class Hero extends Character {
    // attackメソッドの引数をMonsterにする
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージをあたえた！");
        m.hp -= 10;
    }
}
