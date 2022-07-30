class Solution {
    
   static int min;
    static int min_index;
    static int binarySearch(int[] nums,int target,int start,int end){
        
        if(start>end) return -1;
        
        int mid = (start+end)/2;
        
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid]<target){
            return binarySearch(nums,target,mid+1,end);
        }
        if(nums[mid] < min){
            min = nums[mid];
            min_index = mid;
        }
        return binarySearch(nums,target,start,mid-1);
    }
    static int lowerBound(int[] nums,int target,int start,int end){
        min = Integer.MAX_VALUE;
        min_index = -1;
        
        if(target < nums[start]) return 0;
        else if(target > nums[end]) return end+1;

        int loc = binarySearch(nums,target,start,end);
        
        if(loc !=-1){
            return loc;
        }
        return min_index;
    }

    
    public int maxEnvelopes(int[][] envelopes) {
        
        int length = envelopes.length;
        if(length == 1) return 1;
        
        Arrays.sort(envelopes, new Comparator<int[]>(){
        public int compare(int[] arr1, int[] arr2){
            if(arr1[0] == arr2[0])
                return arr2[1] - arr1[1];
            else
                return arr1[0] - arr2[0];
       } 
     });
        
      
      ArrayList<Integer> temp = new ArrayList<>();
      temp.add(envelopes[0][1]);
      int size = 1;
      for(int i = 1 ; i < length ; i++){
          if(envelopes[i][1] > temp.get(size-1)){
              temp.add(envelopes[i][1]);
              size++;
          }
          else{
              
              int[] arr = new int[size];
              for(int k = 0 ; k < size;k++){
                  arr[k]= temp.get(k); 
              }
              int index = lowerBound(arr,envelopes[i][1],0,size-1);
              temp.set(index,envelopes[i][1]);
          }
      }
      return size;
    }
}
