import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BiggestwordSmallestword {

    public static void main(String[] args){
        String name1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence for the manipulation:");
        name1 = scanner.nextLine();
        String[] splitStr = name1.split("\\s+");
        ArrayList<Integer> list =new ArrayList<Integer>();
        System.out.println("The number of words in the sentence:"  + splitStr.length);
        int i=0;
       while  (i< splitStr.length ){
          int l  =  splitStr[i].length();
          list.add(l);

           i++;
       }
        System.out.println("The list is:" + list);
        System.out.println("The Smallest word is:" + Collections.min(list));
        System.out.println("The Biggest word is:" + Collections.max(list));

        // System.out.println("The first word length is:" + list(0));
       // Collections.sort(list);
        //
    // System.out.println("The smallest word of the sentence is" + list[0]);
       // System.out.println("The smallest word of the sentence is" + list[i]);



    }

}
