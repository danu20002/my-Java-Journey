import java.util.HashMap;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args){
        HashSet<String> danu=new HashSet<String>();
        danu.add("danu");
        danu.add("manu");
        danu.add("manu");
        if(danu.contains("manu")){
            System.out.println("yes it is here");

        }
        else{
            System.out.println("its not");
        }
        System.out.println(danu);

    }
}
