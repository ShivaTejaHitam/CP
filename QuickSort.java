public class QuickSort {

    static int getPartitionIndex(int[] arr,int start,int end){
        int pivot = arr[end];
        int partitionIndex = start;
        
        for(int i = start; i < end ; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;
            }
        }
        
        int temp = arr[end];
        arr[end] = arr[partitionIndex];
        arr[partitionIndex] = temp;
        
        return partitionIndex;
    }
    
    static void quickSort(int[] arr,int start, int end){
        if(start < end){
           int partitionIndex = getPartitionIndex(arr,start,end);
           quickSort(arr,start,partitionIndex-1);
           quickSort(arr,partitionIndex+1,end);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
      
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        
    }
}
