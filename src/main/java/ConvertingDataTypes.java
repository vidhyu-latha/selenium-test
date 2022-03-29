package study.testng;

public class ConvertingDataTypes {
    public static void main(String[] args) {
        String str = "100";
        char c='9';
        // Integer.parseInt()
        System.out.println( Integer.parseInt( str ));
        System.out.println( Integer.parseInt(String.valueOf(c)));
    }
}
