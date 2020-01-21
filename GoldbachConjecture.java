import java.util.*;

public class GoldbachConjecture
{
    public static void main(String args[]){
        Goldbach(10);
        Goldbach(100);
    }

    public static int Goldbach(int n){
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

        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.size(); j++){
                if(ans.get(i)+ans.get(j) == n){
                    System.out.println(ans.get(i)+" + "+ans.get(j));
                    return 0;
                }
            }
        }
        return 0;
    }
}
