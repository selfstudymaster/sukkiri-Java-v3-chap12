package character;

import life.Life;
import matango.Matango;
import monster.Monster;
// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-01
//public abstract class Character implements Life {
//    public String name;
//    public int hp;
//
//    public void run() {
//        System.out.println(this.name + "は逃げ出した！");
//    }
//
//    public abstract void attack(Matango m);
//}

// code12-02, 12-06 抽象クラスCharacter
//public abstract class Character{
//    public String name;
//    public int hp;
//
//    public void run() {
//        System.out.println(this.name + "は逃げ出した！");
//    }
//
//    public abstract void attack(Matango m);
//}

// code12-09
public abstract class Character{
    public String name;
    public int hp;

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    public abstract void attack(Monster m);
}