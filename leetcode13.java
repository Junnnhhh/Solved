import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char t = 'i'; /* 값을 아무거나 지정 */
        
        for(int i=0; i<s.length(); i++) {
            char p = s.charAt(i);
            
            if(p == 'I') {
                sum += 1;
            } else if(p == 'V') {
                sum += 5;
                if(t == 'I') {
                    sum -= 2;
                }
            } else if(p == 'X') {
                sum +=10;
                if(t == 'I') {
                    sum -= 2;
                }
            } else if(p == 'L') {
                sum += 50;
                if(t == 'X') {
                    sum -= 20;
                }
            } else if(p == 'C') {
                sum += 100;
                if(t == 'X') {
                    sum -= 20;
                }
            } else if(p == 'D') {
                sum += 500;
                if(t == 'C') {
                    sum -= 200;
                }
            } else if(p == 'M') {
                sum += 1000;
                if(t == 'C') {
                    sum -= 200;
                }
            }
            
            t = p;
        }
               
        return sum;
    }
}
