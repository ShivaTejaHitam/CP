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
