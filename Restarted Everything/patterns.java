

import java.util.Scanner;
class triangle{
    int rows;
    static void making(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you want");
         int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>i-1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<2*(i-1);k++){
                System.out.print(" ");

            }
            if(i==1){
                System.out.println(" ");

            }else{
                System.out.println("*");
            }
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<2*(i-1);k++){
                System.out.print(" ");

            }
            if(i==1){
                System.out.println(" ");

            }else{
                System.out.println("*");
            }
        }
    }

}

public class patterns {
    public static void main (String[] args){
      triangle mytryangle=new triangle();
       mytryangle.making();

    }
}

