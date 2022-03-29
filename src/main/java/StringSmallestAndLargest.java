public class StringSmallestAndLargest {

    public static void main(String args[]){
        String s="welcometojava";
        int k=3;
        String smallest = "";
        String largest = "";
        String temp1,temp2;
        smallest=s.substring(0,k);
        largest= s.substring(0,k);
        for(int i=0;i<s.length()-k;i++){
            //smallest=s.substring(i,i+k);
            //largest= s.substring(i,i+k);
            temp2=s.substring(i+1,i+1+k);

            if(smallest.compareTo(temp2)<0){
                smallest=smallest;
            }else{
                smallest=temp2;
            }
            if(largest.compareTo(temp2)>0){
                largest=largest;
            }else{
                largest=temp2;
            }
        }
        System.out.println( smallest + "\n" + largest);
    }

}
