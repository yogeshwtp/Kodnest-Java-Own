package T02;

class demo1 {
    int a = 10;

    void disp1() {
        System.err.println("Demo1 :" + a);
    }
}

class demo2 extends demo1 {

}

public class inheritance {
    public static void main(String[] args) {
        demo2 d2 = new demo2();
        d2.disp1();
    }
}
