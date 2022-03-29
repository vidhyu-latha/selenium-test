public class StringSwappingwithout3rdvariable {
    public static void main(String[] args){
        String a="three";
        String b="two";
        a=a+b;
        System.out.println(a);
        b=a.substring(0,(a.length()-b.length()));
        System.out.println(b);
        a=a.substring(b.length());
        System.out.println(a);
    }

}
