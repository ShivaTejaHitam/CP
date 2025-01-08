class BubbleSort{
  public void bubbleSort(int[] arr,int n){
    for(int i = 0 ; i < n-1 ; i++){
      boolean swapped = false;
      for(int j = 0 ; j < n-i-1 ; j++){
        if(arr[j+1] < arr[j]){
           int temp = arr[j+1];
           arr[j+1] = arr[j];
           arr[j] = temp;
          swapped = true;
        }
    }
      if(swapped == false){
         break; // the array is already sorted
      }
  }
}

