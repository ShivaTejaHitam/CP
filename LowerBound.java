class LowerBound{
    
    static int min = Integer.MAX_VALUE;
    static int min_index = -1;
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
        
        if(target < nums[start]) return 0;
        else if(target > nums[end]) return end+1;

        int loc = binarySearch(nums,target,start,end);
        if(loc !=-1){
            return loc;
        }
        return min_index;
    }
}
