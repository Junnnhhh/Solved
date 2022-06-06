class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        int idx = 0;
        boolean flag = true;
        
        while(strs[0].length() > idx) {
            for(int i=1; i<strs.length; i++) {
                if(idx >= strs[i].length() || strs[i-1].charAt(idx) != strs[i].charAt(idx)) {
                    flag = false;
                    break;
                }
            }
            
            if(!flag) {
                break;
            }
            
            answer += strs[0].charAt(idx++);
        }
        
        return answer;
    }
}
