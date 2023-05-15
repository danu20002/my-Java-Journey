import java.util.Scanner;

public   class towerofhanoi {
    public  static void tower(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("disk transferd from  "+src+"to"+dest);
            return;
        }
        tower(n-1,src,dest,help);

        System.out.println("disk transferd from  "+src+"to"+dest);
        tower(n-1,help,src,dest);
        System.out.println("disk tranferd from"+help+"to"+dest);
    }
    public static void main(String[] args){
        //tower of Hanoi
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        tower(n,"S","H","D");
    }
}
