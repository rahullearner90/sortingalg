import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        boolean swapped=false;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }

                if(!swapped){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,5,1,8,10,7,6,15,13,12,14};

        bubbleSort(arr);

        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
