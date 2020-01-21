import java.util.*;

public class AddingBigInts{
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(8);
        a.add(1);
        //a.add(3);
        //a.add(4);
        b.add(1);
        //b.add(3);
        //b.add(2);
        //b.add(1);
        AddingBigInts(a,b);
        System.out.println(AddingBigInts(a,b));
    }

    public static ArrayList<Integer> AddingBigInts(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        /** set a bigger list and a shorter list
         * within common size, add digits plus carry from the end of the list
         * left over digits from longer list plus carry
         */
        
        if(list1.size()>list2.size()){
            int extra = list1.size()-list2.size();
            for(int i=0; i<extra; i++){
                list2.add(0,0);
            }
            
        }
        else{
            int extra = list2.size()-list1.size();
            for(int i=0; i<extra; i++){
                list1.add(0,0);
            }
            
        }
        //System.out.println(longerlist);
        //System.out.println(shorterlist);
        int carry=0;
        for(int i=1; i<=list1.size(); i++){
            int n1=list1.get(list1.size()-i);
            int n2=list2.get(list2.size()-i);
            if(n1+n2+carry<10){
                ans.add(0,n1+n2+carry);
                carry=0;
            }
            else{
                int r=n1+n2+carry-10;
                ans.add(0,r);
                carry=1;
            }
        }
        //System.out.println(ans);
        
        if(carry==1 && list1.size()==list2.size()){
            ans.add(0,1);
        }
        
        return ans;
        
    }
}
