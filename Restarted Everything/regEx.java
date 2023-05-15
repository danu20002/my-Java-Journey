
import java.util.*;
public class regEx {
    public static void main(String[] args){
   StringBuilder danu=new StringBuilder("Bhagirathi");
   Scanner sc=new Scanner(System.in);
    for (int i=0;i<danu.length()/2;i++){
        int front=i;
        int back=danu.length()-1-i;
        char frontchar=danu.charAt(front);
        char backcahr=danu.charAt(back);
        danu.setCharAt(front,backcahr);
        danu.setCharAt(back,frontchar);
    }
        System.out.println(danu);

    }
}
