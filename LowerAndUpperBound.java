public static int upperBound(int[] arr,int target, int start,int end) {
        if(start == end) return start;
        int mid = (start + end) / 2;
        
        if(arr[mid] <= target){
            return upperBound(arr,target,mid+1,end);
        }
        
        return upperBound(arr,target,start,mid);
}

public static int lowerBound(int[] arr,int target, int start,int end) {
        if(start == end) return start;
        int mid = (start + end) / 2;
        
        if(arr[mid] < target){
            return lowerBound(arr,target,mid+1,end);
        }
        
        return lowerBound(arr,target,start,mid);
}


// first and last occurence of an index 

class FirstAndLastOccurence {
    public static int findFirstOccurence(int[] nums,int target,int start, int end){
        if(start > end) return -1;

        int mid = (start + end) / 2;

        if(nums[mid] < target){
            return findFirstOccurence(nums,target,mid+1,end);
        }
        else if(nums[mid] > target){
            return findFirstOccurence(nums,target,start,mid-1);
        }

        int leftOccurence = findFirstOccurence(nums,target,start,mid-1);
        return leftOccurence != -1 ? leftOccurence : mid;
    }

    public static int findLastOccurence(int[] nums,int target, int start,int end) {
        if(start > end) return -1;

        int mid = (start + end) / 2;

        if(nums[mid] < target){
            return findLastOccurence(nums,target,mid+1,end);
        }
        else if(nums[mid] > target){
            return findLastOccurence(nums,target,start,mid-1);
        }

        int rightOccurence = findLastOccurence(nums,target,mid+1,end);
        return rightOccurence != -1 ? rightOccurence : mid;
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 ) return new int[]{-1,-1};
        int[] result = new int[2];
        int firstOccurence = findFirstOccurence(nums,target,0,nums.length-1);
        int lastOccurence = findLastOccurence(nums,target,0,nums.length-1);
        result[0] = firstOccurence;
        result[1] = lastOccurence;

        return result;
    }
}
