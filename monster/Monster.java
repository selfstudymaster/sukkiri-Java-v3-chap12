package monster;
// 第3版 第12章:多態性
// 第2版 第13章:多態性
// chap12

// code12-05
//public abstract class Monster {
//    public void run() {
//        System.out.println("モンスターは逃げ出した！");
//    }
//}

// code12-09
public abstract class Monster {
    public int hp;
    public String name;
    public void run() {
        System.out.println("モンスターは逃げ出した！");
    }
}
