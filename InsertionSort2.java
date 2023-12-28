class InsertionSort2{
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current>arr[j]){
                arr[j+1]=arr[j];

                j--;
            }
            arr[j+1]=current;
        }
    }
    
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String args[]){
        int[] arr={7,2,4,9,5,6,1,3,8};
        insertionSort(arr);
        printArray(arr);
    }
}