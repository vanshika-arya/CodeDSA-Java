import java.util.Scanner;

public class nextCharReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'y') {
                result += (char)(ch + 1);
            } else if (ch == 'z') {
                result += 'a';
            } else if (ch >= 'A' && ch <= 'Y') {
                result += (char)(ch + 1);
            } else if (ch == 'Z') {
                result += 'A';
            } else {
                result += ch; 
            }
        }

        System.out.println("Modified string: " + result);
    }
}
