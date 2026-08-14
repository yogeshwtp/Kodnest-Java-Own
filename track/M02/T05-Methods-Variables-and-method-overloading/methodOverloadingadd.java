class Addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    double add(int a, double b){
        return a+b;
    }
    double add(double a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add ( double a, double b, double c){
        return a+b+c;
    }
    double add(int a, int b, double c){
        return a+b+c;
    }
}
public class methodOverloadingadd {
    public static void main(String[] args){
        Addition al = new Addition();
        al.add(10,20);
        al.add(10,20.5);
    }
}
