import java.util.Locale;
import java.lang.String;

public class Stringtrial {
    public static void main(String[] args) {
        String name1 = "Shibani Morais";
        String name2 = "   SHIBANI MORAIS   ";
        String name3 = "The world is a beautiful place";
        System.out.println("The trimmed text:" + name2.trim());
        System.out.println("The Case changed to lowercase:" + name2.trim().toLowerCase());
        System.out.println("The case changed to upper case:" + name1.toUpperCase());
        if (name3.startsWith("The") && name1.endsWith("Morais"))
            System.out.println("Yes, it contains The");
        if (name3.contains("hero") || name3.endsWith("place"))
            System.out.println("Yes, Either hero/place word is there");
        System.out.println("The hashcode of name1:" + name1.hashCode());
        String[] arrOfStr = name3.split("a", 2);

        for (String a : arrOfStr) {
            System.out.println("The name 3 can be split as:" + a);
        }
        String object_1 = new String();
        int value1 = name1.length();
        System.out.println("The length of object_1:" + value1);
        String object_2 = new String();
        int value2 = name3.length();
        System.out.println("The length of object_2:" + value2);

        if (object_1 == object_2)
            System.out.println("the object instances are same");
        if (name1.toUpperCase().equals(name2.trim()))
            System.out.println("The strings are equal");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            System.out.println("The append method functionality:" + name1 + stringBuilder.append(name2.trim()));


        }

    }
}