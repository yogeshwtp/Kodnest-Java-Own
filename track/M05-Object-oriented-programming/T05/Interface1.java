interface Shape {
    public abstract void input1();

    public abstract void disp();
}

class Square implements Shape {
    @Override
    public void input1() {
        System.out.println("INput");
    }

    public void disp() {
        System.out.println("Disp");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Square s = new Square();
        s.input1();
        s.disp();

        Shape ref;
        ref = s;
        ref.disp();
        ref.input1();
    }
}