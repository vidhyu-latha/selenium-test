public class ReplaceAllWithRegx {
    public static void main(String args[]){
        String str1="        dghiudfgh      f";
        str1=str1.trim();
        str1 = str1.replaceAll("\\p{Space}+", " ");
        String[] str2=str1.split(" ");
        System.out.println(str2.length);
        for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
        }
    }
}
