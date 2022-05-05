import java.util.Scanner;

public class SubstringReplace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = scanner.nextLine();
        System.out.println("Enter the word to be removed:");
        String s2 = scanner.nextLine();
        System.out.println("Enter the word to be replaced:");
        String s3 = scanner.nextLine();
        if (s1.contains(s2)){
            String replace_String = s1.replace(s2,s3);
            System.out.println("The replaced String:" + replace_String);
        }

    }
}
