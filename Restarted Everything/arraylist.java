import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){
        LinkedList<Integer> man=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);



        System.out.println("enter the number of elements to add");
        int n=sc.nextInt();
      for(int i=0;i<n ;i++){
          System.out.println("Enter what toa add in the Arraylist");
          int  value=sc.nextInt();
          man.add(value);
      }


        System.out.println(man);
       int h=sc.nextInt();
        man.remove(h);
        System.out.println("after deleting the position");
        System.out.println(man);
    }
}
