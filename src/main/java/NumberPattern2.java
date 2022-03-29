public class NumberPattern2 {
    public static void main(String[] args) {
        int count=0;
        for (int x = 1; x <= 4; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(++count+" ");
            }
            System.out.println();
        }
    }
}
