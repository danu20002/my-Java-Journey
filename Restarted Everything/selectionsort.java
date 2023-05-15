public class selectionsort {
    public static void main(String[] args) {

        int arr[]={7,8,3,2,1};

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;i<arr.length;j++) {
                if (arr[smallest]>arr[j]) {
                    smallest = j;
                }
            }
                //swap
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;

        }

       danappa.gun(arr);

    }
}


class danappa{
    public static void gun(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}