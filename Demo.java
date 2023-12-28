import java.util.Arrays;
class Demo{
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min_idx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[j-1]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String args[]){
        int[] arr={7,8,3,1,2};

        selectionSort(arr);
        System.out.print("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}