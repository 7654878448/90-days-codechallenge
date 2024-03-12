package string;

import java.util.Scanner;

public class Toggle {
    public static void toggle(char st[]) {
        for (int i = 0; i < st.length; i++) { // Fixed loop condition
            if (st[i] >= 65 && st[i] <= 90) {
                st[i] = (char) (st[i] + 32);
            } else {
                st[i] = (char) (st[i] - 32);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next(); // Read the entire string
        char ch[] = str.toCharArray(); // Convert string to char array

        toggle(ch);

        System.out.println("Toggled string:");
        for (char c : ch) {
            System.out.print(c);
        }

        sc.close();
    }
}
