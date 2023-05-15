import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int arr[]={7,8,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){

             if(arr[j]>arr[j+1]){
                 //swap
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;

             }
            }
        }
        sort.amma(arr);
    }
}
class sort{
    public static void amma(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}