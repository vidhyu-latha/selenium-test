//Write code to print duplicate elements from an array?
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 84, 45,67,84};
        int l = 0,count;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
