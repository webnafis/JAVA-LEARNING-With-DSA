package strings;

import java.util.*;

public class basics {

    public static float shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static boolean strPalindrome(String str) {
        int s = 0, e = str.length() - 1;

        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void printLatters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static String subString(String str, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static String toUpperCase(String str) {
        StringBuilder st = new StringBuilder("");
        st.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                st.append(' ');
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            } else {
                st.append(str.charAt(i));
            }

        }
        return st.toString();
    }

    public static String stCompress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) { // two loop but time complexity is O(n)
            sb.append(str.charAt(i));
            Integer charNum = 1;

            while (str.length() - 1 > i && str.charAt(i) == str.charAt(i + 1)) {
                charNum++;
                i++;
            }

            if (charNum > 1) {
                sb.append(charNum.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        // char ch[] = { 'a', 'b' };
        // String st = "nafis shahriar";
        // String st1 = new String("nafis shahriar1");
        // printLatters(st1);
        // System.out.println(strPalindrome("noon"));
        // System.out.println(st.length());
        // System.out.println(st.charAt(4));
        // String fn = "nafis";
        // String ln = "sharefrhriar";
        // String fullname = fn + " " + ln;
        // System.out.println(fullname);
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(shortestPath("NS"));
        // String s1 = "nafis";
        // String s2 = "nafis";
        // String s3 = new String("nafis");
        // if (s3.equals(s2)) {
        // System.out.println("true");
        // }
        // if (s3 == s2) {
        // System.out.println("true");
        // }
        // if (s1 == s2) {
        // System.out.println("true");
        // }
        // String name = "nafis shahriar";
        // System.out.println(name.substring(6, 10));
        // System.out.println(subString("nafis shahriar", 6, 10));
        // String fruits[] = { "apple", "mango", "banana" };
        // String largest = fruits[0];
        // for (int i = 0; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);
        // StringBuilder fs = new StringBuilder("");
        // for (char i = 'a'; i <= 'z'; i++) {
        // fs.append(i);
        // }
        // System.out.println(fs);

        System.out.println(stCompress("abcd"));
    }
}
