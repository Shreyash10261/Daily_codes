import java.util.Scanner;

class difference {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        difference obj = new difference();
        System.out.println("Extra character is: " + obj.findTheDifference(s, t));
    }
}