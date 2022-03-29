public class SortString {

    public static void main(String[] args) throws Exception{

        //String str = "geeksforgeeks";
        String str = "selenium";
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr);
    }

}
