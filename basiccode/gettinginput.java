import java.util.*;

public class gettinginput {
    public static void main(String args[]){


    int num;
    String name;

    try (var k = new Scanner(System.in)) {
        System.out.println("enter your name:");
        name=k.nextLine();
        System.out.println("age:");
        num=k.nextInt();
    }
    System.out.println("name="+name);
    System.out.println("age="+num);
   }
}