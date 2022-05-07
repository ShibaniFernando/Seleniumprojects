import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word:");
        char[] a = scanner.next().toCharArray();
        System.out.println("Enter the second word:");
        char[] b = scanner.next().toCharArray();


        if (a.length != b.length) {
            System.out.println("The words aren't Anagrams");
        } else {
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i < a.length; i++) {

                if (a[i] != b[i]) {
                    System.out.println("They are not Anagrams");
                    break;
                }
            }

            }
        System.out.println("They are Anagrams");
        }


}
