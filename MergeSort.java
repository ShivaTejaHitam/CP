
public class MergeSort {
    
    static void merge(int[] arr,int start,int mid,int end){
        int l1 = mid-start+1;
        int l2 = end - mid;
        
        int[] leftArr = new int[l1];
        int[] rightArr = new int[l2];
        
        for(int i = 0 ; i < l1 ; i++){
            leftArr[i] = arr[start+i];
        }
        
        for(int i = 0 ; i < l2 ; i++){
            rightArr[i] = arr[mid+1+i];
        }
        
        int i=0,j=0,k=start;
        
        while(i < l1 && j < l2){
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while(i < l1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while(j < l2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr,int start,int end){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr,start, mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
