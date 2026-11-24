import java.util.*;
public class ArrayList3 {
    public static void main(String[] args){
        //inser, update and remove elements

        List<String> name = new ArrayList<>();
        name.add("anu");
        name.add("Banu");
        System.out.println(name);
        name.add(1,"Ravi");
        System.out.println(name);
        name.set(1, "Ravi B S");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
    }
}
