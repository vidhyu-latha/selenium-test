public class StringAnagram {
    public static void main(String args[]) {
        String a = "anagram";
        String b = "margana";
        a = a.toLowerCase();
        b = b.toLowerCase();
        char c;
        int index;
        if (a.length() != b.length()) {
            System.out.println("no Anagrams");
        }
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            index = b.indexOf(c);
            if (index != -1) {
                b = b.substring(0, index) + b.substring(index + 1, b.length());
            } else {
                System.out.println("no Anagrams");
                break;
            }
        }
        System.out.println(" Anagrams");
    }
}
