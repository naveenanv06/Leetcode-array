import java.util.*;
class Solution {
    public int calPoints(String[] o) {
        
        ArrayList<Integer> a=new ArrayList<>();
        for(String s:o){
            int n=a.size();
            switch(s){
                case "+":
                   int c=a.get(n-1)+a.get(n-2);
                   a.add(c);
                   break;
                case "D":
                    int d=a.get(n-1)*2;
                    a.add(d);
                    break;
                case "C":
                    a.remove(n-1);
                    break;
                default:
                    a.add(Integer.parseInt(s));

               
            }
        }
        int tot=0;
        for(int i=0;i<a.size();i++){
            tot+=a.get(i);
        }
        return tot;
    }
}