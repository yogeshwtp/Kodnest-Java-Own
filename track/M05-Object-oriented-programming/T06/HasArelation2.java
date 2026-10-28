class OS{
    OS(){
        System.out.println("OS is installed");
    }


    void checkOS(){
        System.out.println("OS is still executing");
    }
}

class Charger{
    Charger(){
        System.out.println("Chargrer created");
    }

    void getCharger(){
        System.out.println("Charger can be used for charging");
    }
}

class Mobile{
    OS o = new OS();

    Mobile(){
        System.out.println("Mobile created with OS");
    }

    void hasA(Charger c){
        System.out.println("Charger acquired");
    }
}
public class HasArelation2 {
    public static void main(String[] args){
        Mobile m;
        m = new Mobile();

        Charger c;
        c = new Charger();

        m.hasA(c);

        c.getCharger();
        m=null;
        m.o.checkOS();//Exception
        c.getCharger();
    }
}
