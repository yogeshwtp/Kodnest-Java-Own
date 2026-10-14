abstract class Parent {
    abstract void disp1();
    abstract void disp2();

    
}

class Child1 extends Parent{
    @Override 
    void disp1(){
        System.out.println("Inside Child1 disp1");
    }

    @Override 
    void disp2(){
        System.out.println("Inside child1 disp2");
    }
}

class Child2 extends Parent{
    @Override 
    void disp1(){
        System.out.println("Inside Child2 disp1");
    }

    @Override 
    void disp2(){
        System.out.println("Inside child2 disp2");
    }
}

public class Abstraction {
    public static void main(String[] args){

    Child1 c1 = new Child1();
    Child1 c2 = new Child1();
    
    accessMethod(c1);
    accessMethod(c2);
    }

    static  void accessMethod(Parent ref){
        ref.disp1();
        ref.disp2();
    }
}
