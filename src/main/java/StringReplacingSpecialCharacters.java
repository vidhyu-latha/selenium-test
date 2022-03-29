import java.util.Scanner;

public class StringReplacingSpecialCharacters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            // s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            s=s.trim();
            s = s.replaceAll("[^a-zA-Z0-9] ", " ");
            s = s.replaceAll("[^a-zA-Z0-9]", " ");

            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");

                // Print number of tokens
                System.out.println(strings.length);

                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
        scan.close();
    }
}
