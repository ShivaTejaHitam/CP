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
