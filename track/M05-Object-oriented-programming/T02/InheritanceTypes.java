class Parent {
    void disp1() {
        System.out.println("Inside parent disp1");
    }

    void disp2() {
        System.out.println("Inside parent disp2");
    }
}

class Child extends Parent {
    @Override
    void disp2() {
        System.out.println("Inside child disp2");
    }

    void disp3() {
        System.out.println("Inside child disp3");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        Child c = new Child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}
