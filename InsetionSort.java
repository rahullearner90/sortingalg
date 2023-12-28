import java.util.Arrays;

public class InsetionSort {

    static void insetionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String args[]){
        int[] arr={
            50,45,1,5,2,4,30,25,35,20,14,18,40
        };
        System.out.println("Without Sorted array is :");
        System.out.println(Arrays.toString(arr));

        insetionSort(arr);

        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
