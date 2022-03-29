import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class operationsonBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String s1,s2;
        s1=scan.nextLine();
        s2=scan.nextLine();
        System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
        System.out.println(new BigInteger(s1).multiply(new BigInteger(s2)));
    }
}
