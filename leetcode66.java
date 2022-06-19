class Solution {
    public int[] plusOne(int[] digits) {
        int[] tmp = new int[102];
        int idx=0;
        tmp[idx]=1;
        
        for(int i=digits.length-1; i>=0; i--) {
            int sum = digits[i] + tmp[idx];
            
            if(sum >= 10) {
                tmp[idx++] = sum - 10;
                tmp[idx] = 1;
            } else {
                tmp[idx++] = sum;
            }
            
            if(i==0 && sum >=10) idx++;
        }
        
        int[] ans = new int[idx];
        int j=0;
        
        for(int i=idx-1; i>=0; i--) {
            ans[j++] = tmp[i];
        }
        
        return ans;
    }
}
