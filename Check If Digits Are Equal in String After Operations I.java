public class Solution {

 
    public static boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int d1 = s.charAt(i) - '0';
                int d2 = s.charAt(i + 1) - '0';
                next.append((d1 + d2) % 10);
            }
            s = next.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }

    public static void main(String[] args) {
        String s1 = "3902";
        String s2 = "34789";
       
        System.out.println(hasSameDigits(s1)); 
        System.out.println(hasSameDigits(s2)); 
    }
}
