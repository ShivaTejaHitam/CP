class Solution:
    def maximumSumSubarray (self,K,Arr,N):
        # code here 
        i = 0
        j = 0
        
        window_sum = 0
        global_sum = -sys.maxsize
        
        while(j < N):
            window_sum = window_sum + Arr[j]
            if((j - i + 1) < K):
                j+=1;
            
            else:
                global_sum = max(global_sum,window_sum)
                window_sum = window_sum - Arr[i]
                j+=1;
                i+=1;
            
        
        
        return global_sum;

//**************************************************/
/* variable size sliding window */
public static int lenOfLongSubarr (int A[], int N, int K) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxLength = Integer.MIN_VALUE;
        
        while(end < N){
            sum = sum + A[end];
            if(sum < K){
                end++;
            }
            else if(sum == K){
                maxLength = Math.max(maxLength,end-start+1);
                end++;
            }
            else if(sum > K){
                while(sum > K){
                    sum = sum - A[start];
                    start++;
                }
                end++;
            }
        }
        
        return maxLength;
}

public int longestKSubstr(String s, int k) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        int start = 0;
        int result = -1;
        
        for(int end=0 ;end < s.length() ; end++){
            char charAtEnd = s.charAt(end);
            map.put(charAtEnd,map.getOrDefault(charAtEnd,0)+1);
            
            while(map.size() > k){
                char charAtStart = s.charAt(start);
                map.put(charAtStart, map.get(charAtStart) - 1);
                
                if(map.get(charAtStart) == 0){
                    map.remove(charAtStart);
                }
                
                start++;
            }
            
            if(map.size() == k){
                result = Math.max(result,end - start +1);
            }
        }
        
        
        return result;
    }


*******************************************************************************************
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0;

        int start = 0;
        int sum = 0;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum > goal) {
                sum -= nums[start];
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
}
