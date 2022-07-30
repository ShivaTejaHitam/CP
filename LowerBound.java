class LowerBound{
    
    static int min = Integer.MAX_VALUE;
    static int index = -1;
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
            index = mid;
        }
        return binarySearch(nums,target,start,mid-1);
    }
    static int lowerBound(int[] nums,int target,int start,int end){
        int loc = binarySearch(nums,target,start,end);
        if(loc !=-1){
            return loc;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7,8,9};
        System.out.println(nums[lowerBound(nums,3,0,nums.length-1)]);

    }
}
