class Solution {
    public int get_int(char a){
            int x=0;
            switch(a){
                case 'I':
                    x=1;
                    break;
                    
                case 'V':
                    x=5;
                    break;
                    
                case 'X':
                    x=10;
                    break;
                    
                case 'L':
                    x=50;
                    break;
                case 'C':
                    x=100;
                    break;
                case 'D':
                    x=500;
                    break;
                case 'M':
                    x=1000;
                    break;

            }
            return x;
    }
    
    public int romanToInt(String s) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int current = get_int(s.charAt(i));
            
            if (i < s.length() - 1) {
                int next = get_int(s.charAt(i + 1));
                
                if (current < next) {
                    sum -= current;
                } else {
                    sum += current;
                }
            } else {
                sum += current;
            }
        }
        
        return sum;
        
    }
}