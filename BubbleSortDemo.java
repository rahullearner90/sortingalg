import java.util.Arrays;

class BubbleSortDemo{

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
    public static void main(String args[]){
        int[] arr={
            5,3,4,1,9,6,7,8,10,12,0
        };

        bubbleSort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}