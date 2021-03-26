package main;

import life.Life;
import character.Character;
import hero.Hero;
import thief.Thief;
import wizard.Wizard;

import monster.Monster;
import slime.Slime;
import goblin.Goblin;
import deathbat.DeathBat;
import matango.Matango;


// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-01
//public class Main {
//    public static void main(String[] args) {
//        // 抽象クラスやインターフェースからインスタンスは生成できないが、
//        // Life型のWizardインスタンス のように型として利用することはできる
//        Life lf = new Wizard();
//        Matango m = new Matango();
//    }
//}

// code12-03
//public class Main {
//    public static void main(String[] args) {
//        // 抽象クラスやインターフェースからインスタンスは生成できないが、
//        // Life型のWizardインスタンス のように型として利用することはできる
//        // Life lf = new Wizard();
//        Wizard w = new Wizard();
//        Matango m = new Matango();
//        w.name = "アサカ";
//        w.attack(m);
//        w.fireball(m);
//    }
//}

// code12-04
//public class Main {
//    public static void main(String[] args) {
//        // 抽象クラスやインターフェースからインスタンスは生成できないが、
//        // Life型のWizardインスタンス のように型として利用することはできる
//        // Life lf = new Wizard();
//        Wizard w = new Wizard(); // w はWizardクラスのインスタンスが入った変数
//        // 抽象クラス Characterを型として利用
//        Character c = w; // c はCharacter型のなにか (WizardなのかHeroなのか判別できなくなる)
//        Matango m = new Matango();
//        c.name = "アサカ";
//        c.attack(m); // CharacterクラスにもWizardクラスにもあるメソッドなので実行できる
//        c.fireball(m); // ここでコンパイルエラーになる
//        // java: シンボルを見つけられません
//        //  シンボル:   メソッド fireball(matango.Matango)
//        //  場所: タイプcharacter.Characterの変数 c
//    }
//}

// code12-05
//public class Main {
//    public static void main(String[] args) {
//        Slime s = new Slime();
//        Monster m = new Slime();
//        s.run(); // 実行結果: スライムはさささっと逃げ出した！
//        m.run(); // 実行結果: スライムはさささっと逃げ出した！
//    }
//}

// code12-06 コードの重複が多く将来的に多くの修正が必要
//public class Main {
//    public static void main(String[] args) {
//        Hero h1 = new Hero();
//        Hero h2 = new Hero();
//        Thief t1 = new Thief();
//        Wizard w1 = new Wizard();
//        Wizard w2 = new Wizard();
//        // まず宿屋に泊まる
//        h1.hp += 50;
//        h2.hp += 50;
//        t1.hp += 50;
//        w1.hp += 50;
//        w2.hp += 50;
//    }
//}

// code12-07
//public class Main {
//    public static void main(String[] args) {
//        // 配列と多態性を使う
//        Character[] c = new Character[5];
//        c[0] = new Hero();
//        c[1] = new Hero();
//        c[2] = new Thief();
//        c[3] = new Wizard();
//        c[4] = new Wizard();
//        // 宿屋に泊まる
//        for (Character ch : c) {
//            ch.hp += 50;
//        }
//    }
//}

// code12-10
public class Main {
    public static void main(String[] args) {
        // 配列と多態性を使う
        Monster[] monsters = new Monster[3];
        monsters[0] = new Slime();
        monsters[1] = new Goblin();
        monsters[2] = new DeathBat();
        for (Monster m : monsters) {
            m.run();
        }
    }
}