package T03;

class Demo {
    static {
        System.out.println("1st static block executed.");
    }
    static {
        System.out.println("2nd static block executed.");
    }
    static {
        System.out.println("3rd static block executed.");
    }
    {
        System.out.println("1st Non-static block executed.");
    }
    {
        System.out.println("1st Non-static block executed.");
    }
    {
        System.out.println("1st Non-static block executed.");
    }
}

public class StaticBlockExecutionOrder {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d3 = new Demo();
        Demo d2 = new Demo();
    }
}
