package mypack;
import java.util.*;

class manu {
    static void bark(){
        System.out.println("bou bou");
     }
      class sinu{
         public void sing(){
            System.out.println("mew mew!");
        }
     }

}
 class Apap extends manu{
    
      static void danu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the value of x ");
        int  x=sc.nextInt(); 
        System.out.println(x);
         sc.close();
        }
   
    }
public class App{
    public static void main(String[] args){
        Apap.danu();
        manu.bark();
        System.out.println("go and fuck yourselfnb vcxa");
        manu myouter=new manu();
        manu.sinu myinner=myouter.new sinu();
        myinner.sing();
        kangu musangu=new kangu();
        musangu.run();
        musangu.animalsound();
    }
}

