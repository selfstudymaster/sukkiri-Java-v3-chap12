package matango;

import monster.Monster;

// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-01
public class Matango {
    public int hp;
    public final int LEVEL = 10;
    public char suffix;

    public  void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
