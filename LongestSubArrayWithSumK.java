class Solution {
    public int longestSubarray(int[] arr, int k) {
        int length = arr.length;
        if(length == 1 && arr[0] == k) return 1;
        if(length == 1 && arr[0] != k) return 0;
        
        int sum = 0;
        Map<Integer,Integer> prefixSumMap = new HashMap<>();
        int max = 0;
        
        for(int j = 0 ; j < length ; j++){
            sum = sum + arr[j];
            
            if(sum == k){
                max = Math.max(max,j+1);
            }
            
            if(prefixSumMap.containsKey(sum - k)){
                int i = prefixSumMap.get(sum-k);
                max = Math.max(max,j-i);
            }
            
            if(!prefixSumMap.containsKey(sum)){
                prefixSumMap.put(sum,j);
        
        }
        
        return max;
    }
}
