public class NumberPalindrome {
    public static void main(String args[]) {
        int num = 121;
        int rev = 0, rem;
        int temp;

        temp = num;
        while (num > 0) {
            rem = num % 10;
            // System.out.println(rem);
            rev = (rev * 10) + rem;
            //System.out.println(rev);
            num = num / 10;
            //System.out.println(num);
            // System.out.println("*********");
        }
        if(temp==rev){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
