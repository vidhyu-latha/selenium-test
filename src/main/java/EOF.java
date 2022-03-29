package study.testng;

import java.util.Scanner;

public class EOF {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            String str=scanner.nextLine();
            int a=0;
            while(str!=null){
                System.out.println(++a+" "+str);
                if(scanner.hasNext()){
                    str=scanner.nextLine();
                }else{
                    str=null;
                }
            }
            scanner.close();
        }
}
