import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> myage=new HashMap<String,Integer>(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        String danu=sc.nextLine();
        int n=sc.nextInt();
        myage.put(danu,n);
        System.out.println(myage);
        System.out.println(myage.containsKey("danu"));

        System.out.println("i am "+"\"danu\"and i am\t"+n);
    }
}
