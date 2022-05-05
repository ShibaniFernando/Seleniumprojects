import java.util.Arrays;
import java.util.Scanner;

public class testing{
    public static void main(String[] args){
        int num_of_names;
        Scanner input = new Scanner(System.in);
            System.out.println("Enter number of names to be sorted: ");

            num_of_names = input.nextInt();

            int index= 0;
            String friends[] = new String[num_of_names];
            while (index <num_of_names){
                System.out.print("Enter string : ");
                friends[index] = input.next();

                index++;


        }
        Arrays.sort(friends);
        System.out.println("The list of names in ascending order:" + Arrays.toString(friends));
    }
}