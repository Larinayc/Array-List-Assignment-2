import java.util.*;

public class SieveOfEratosthenes{
    public static ArrayList<Integer> SieveOfEratosthenes(int n){
        ArrayList<Integer> ans = new ArrayList<Integer> ();
        for(int i=2; i<=n; i++){
            ans.add(i);
        }

        int p=2;
        while(p<=n){
            for(int i=ans.size()-1; i>=0; i--){
                if(ans.get(i)>p && ans.get(i)%p==0){
                    ans.remove(i);
                }
            }
            p++;
        }
        return ans;
    }

    public static void main(String args[]){
        SieveOfEratosthenes(10);
        System.out.println(SieveOfEratosthenes(10));
        SieveOfEratosthenes(100);
        System.out.println(SieveOfEratosthenes(100));
    }
}
