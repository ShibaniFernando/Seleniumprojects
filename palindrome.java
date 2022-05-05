import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String name1;
        char ch;
        String name2 = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for the palindrome check:");
        name1 = scanner.nextLine();
        name1 = name1.toLowerCase();
        for (int i = 0; i < name1.length(); i++) {
            ch = name1.charAt(i);
            name2 = ch + name2;
        }
        if (name1.equals(name2)) {
            System.out.println("Yes, Its a palindrome");
        }
        else {
            System.out.println("The reversed string is:" + name2 );
            System.out.println("No, its not a palindrome");
        }
    }
}