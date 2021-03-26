package goblin;

import monster.Monster;
// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-08
public class Goblin extends Monster {
    public int hp;
    public final int LEVEL = 12;
    public char suffix;
    public void run() {
        System.out.println("ゴブリンはダダダッと逃げ出した！");
    }
}
