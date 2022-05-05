import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the string for reversing:");
         String s1= scanner.nextLine();
        StringBuilder s2 = new StringBuilder();
        s2.append(s1);
        s2.reverse();
        System.out.println(s2);
    }
}


