public class StringMethods{
    public static void main(String[] args){

        String str = "KodNest Technologies";
        String s1 = "Yogesh";
        String s2 = " ";
        String s3 = "";
        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(3));
        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("Kod"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.subString(5, 14));

        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());

    }
}