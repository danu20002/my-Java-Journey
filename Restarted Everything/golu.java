import java.util.Scanner;
import java.io.*;
public class golu {
    public static void main(String args[]){
        int x=100;
        Scanner sc=new Scanner(System.in);
        System.out.printf("printing simple"+"integer.x=%d\n",x);
        System.out.printf("Formated with"+"precison:PI=%2f\n",Math.PI);
        float n=5.2f;
        System.out.printf("Formated to"+"spacific width:;n=%4f\n",n);
        n=2324435.3f;
        System.out.printf("Formated to"+"right marginn=%20.4f\n",n);
    }
}