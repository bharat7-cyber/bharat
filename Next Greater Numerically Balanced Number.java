public class Solution {
    public static int nextBeautifulNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isBalanced(num)) return num;
            num++;
        }
    }

    private static boolean isBalanced(int x) {
        String s = String.valueOf(x);
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (count(s, c) != d) return false;
        }
        return true;
    }

    private static int count(String s, char ch) {
        int cnt = 0;
        for (char c : s.toCharArray()) if (c == ch) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(nextBeautifulNumber(1));
        System.out.println(nextBeautifulNumber(1000));
        System.out.println(nextBeautifulNumber(3000));
    }
}
