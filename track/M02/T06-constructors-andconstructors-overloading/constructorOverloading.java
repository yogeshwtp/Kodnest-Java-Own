class Student1{

    String name;
int age;
double height;

Student1(){
    name = "Anu";
    age = 19;
    height = 5.0;
}

Student1(String name){
    this.name = name;
}
Student1(String name, int age, double height){
    this.name = name;
    this.age = age;
    this.height = height;
}

void display(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(height);
}

}
public class constructorOverloading {
    public static void main(String[] args){
        Student1 s2 = new Student1();
        s2.display();

        Student1 s3 = new Student1("Manu");
        s3.display();

        Student1 s1 = new Student1("Raja", 18, 5.5);
        s1.display();
    }
}
