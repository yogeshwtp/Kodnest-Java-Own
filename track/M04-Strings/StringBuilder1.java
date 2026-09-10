public class StringBuilder1{
    public ststic void main(String[] args){
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.lenght());

        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.lenght());

        sb.append(" is a programming language");

        System.out.println(sb.capacity());
        System.out.println(sb.lenght());

        sb.append(" and object oriented");

        System.out.println(sb.capacity());
        System.out.println(sb.lenght());
    }
}