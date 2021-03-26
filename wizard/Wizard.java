package wizard;

import character.Character;
import matango.Matango;
import monster.Monster;
// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-01
//public class Wizard extends Character {
//    int mp;
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に3ポイントのダメージ！");
//        m.hp -= 3;
//    }
//    public void fireball(Matango m) {
//        System.out.println(this.name + "は火の玉を放った！");
//        System.out.println("敵に20ポイントのダメージ！");
//        m.hp -= 20;
//        this.mp -= 5;
//    }
//}

// code12-02 12-06 抽象クラスCharacterを継承したWizardクラス
//public class Wizard extends Character {
//    public int mp;
//    public void attack(Matango m) {
//        System.out.println(this.name + "の攻撃！");
//        System.out.println("敵に3ポイントのダメージ！");
//        m.hp -= 3;
//    }
//    public void fireball(Matango m) {
//        System.out.println(this.name + "は火の玉を放った！");
//        System.out.println("敵に20ポイントのダメージ！");
//        m.hp -= 20;
//        this.mp -= 5;
//    }
//}

// code12-09
public class Wizard extends Character {s
    public int mp;
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に3ポイントのダメージ！");
        m.hp -= 3;
    }
    public void fireball(Monster m) {
        System.out.println(this.name + "は火の玉を放った！");
        System.out.println("敵に20ポイントのダメージ！");
        m.hp -= 20;
        this.mp -= 5;
    }
}
