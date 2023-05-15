import java.util.Scanner;


public class apna2 {
    public static void OddSum(int n){
        int common=1;
        for(int i=1;i<=n;i++){
        if(n%2!=0){
             common=common+i;
            System.out.println(common);

        }


        }
    }
public static void main(String[] args){
     int n;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
     n=sc.nextInt();
     OddSum(n);

    }
}
