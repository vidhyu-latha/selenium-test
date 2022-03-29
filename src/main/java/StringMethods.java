public class StringMethods {
    public static void main(String[] args) {
        String str = "vidhyu";
        System.out.println("******* Char At **********");
        char ch = str.charAt(3);
        System.out.println(ch);
        String str2 = "Hello World";
        String str3 = "Hai World";
        System.out.println("******* Compare  **********");
        System.out.println("Compare :" + str2.compareTo(str3));
        String str4 = "Signature";
        String str5 = "signature";
        System.out.println("******* Concat  **********");
        System.out.println(str4.concat(str5));
        System.out.println("******* Contains **********");
        String str6 = "Examples";
        String str7 = "ples";
        if (str6.contains(str7)) {
            System.out.println("Contains");
        } else {
            System.out.println("Not Contains");
        }
        System.out.println("******* End With  **********");
        if (str6.endsWith("s")) {
            System.out.println("EndsWith");
        } else {
            System.out.println("Not EndsWith");
        }
        System.out.println("******* Format **********");
        System.out.println(String.format("str6 is %s" ,str6));
        System.out.println(String.format("Value is %f",32.7856));
        System.out.println(String.format("Value is %12f",32.7856));
        System.out.println(String.format("Value is %6f",32.7856));
        byte[] barr = str6.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.print("-"+barr[i]);
        }

        System.out.println();
        System.out.println("******* back to String *******");
        String s2 = new String(barr);
        System.out.println(s2);

        //Learn about getChars method
        System.out.println("******* index of **********");
        String str8 = "wellness";
        System.out.println(str8.indexOf('n'));
        System.out.println(str8.indexOf('e', 2));
        System.out.println(str8.indexOf("ness"));
        System.out.println(str8.indexOf("ness", 4));

        //Intern
        System.out.println("******* Intern  **********");
        String str9 = "Welcome to Java";
        String str10 = new String("Welcome to Java").intern();
        String str11 = str10.intern();

        System.out.println(str9 == str10);//false
        System.out.println(str9 == str11);//true
        System.out.println(str11 == str10);//false
        System.out.println("******* is Empty **********");
        String str12 = "Welcome to Java";
        String str13 = "";
        System.out.println(str12.isEmpty());
        System.out.println(str13.isEmpty());
        String str14 = "hello";
        String str15 = "World";
        String str16 = "Welcome";
        System.out.println("******* Join **********");
        String str17 = String.join("-", str14, str15, str16);
        System.out.println(str17);
        System.out.println("******* length **********");
        String str18 = " is index position from where index of the char value or substring is retured";
        System.out.println("Length :  " + str18.length());
        System.out.println("******* Last index of **********");
        System.out.println(str18.lastIndexOf('e'));
        System.out.println(str18.lastIndexOf("is"));
        System.out.println(str18.lastIndexOf("is", 3));
        System.out.println("********** Replace **************");
        System.out.println(str18.replace("is", "are"));
        System.out.println("********** Replace ALL **************");
        System.out.println(str18.replaceAll("is", "was"));

        System.out.println("******* Split **********");
        String str19 = "java string split method by javatpoint";
        String[] str20 = str19.split(" ");

        for (int i =0; i < str20.length; i++) {
            System.out.println ( str20[i]);
        }
        System.out.println("******* Starts With **********");
        System.out.println(str19.startsWith("java"));
        System.out.println("******* SubString **********");
        System.out.println(str19.substring(2, 11));
        System.out.println(str19.substring(5));
        System.out.println("******* To Char Array **********");
        char[] ch1 = str19.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            System.out.print("-" + ch1[i]);
        }
        System.out.println();
        System.out.println("******* Upper Case **********");
        System.out.println(str19.toUpperCase());
        System.out.println("******* Lower Case **********");
        String str21 = "        HELLO TO LIFE LONG CUASTOMERS.       ";
        System.out.println(str21.toLowerCase());
        System.out.println("******* Trim  **********");
        System.out.println(str21.trim());
        System.out.println("******* Value of  **********");
        String s1 = String.valueOf(234);
        System.out.println(s1 + "234");
        System.out.println(s1 + 10);


    }
}
