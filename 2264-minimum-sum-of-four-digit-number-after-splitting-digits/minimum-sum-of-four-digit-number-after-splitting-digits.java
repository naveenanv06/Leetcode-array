import java.util.*;
class Solution {
    public int minimumSum(int num) {
        List<Integer> l=new ArrayList<>();

        while(num>0){
            l.add(num%10);
            num/=10;
        }
        Collections.sort(l);
        int a=l.get(0)*10+l.get(l.size()-1);
        int b=l.get(1)*10+l.get(l.size()-2);
        return a+b;
    }
}