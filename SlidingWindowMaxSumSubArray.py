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
