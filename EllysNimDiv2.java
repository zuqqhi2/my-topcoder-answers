import java.util.Arrays;

public class EllysNimDiv2 {
   private final int LIM = 2048;
 
   int[] a;
   int[][] dyn;
 
   int recurse(int idx, int cur) {
       if (idx == a.length)
           return cur == 0 ? 0 : 1000000001;
       if (dyn[idx][cur] != -1)
           return dyn[idx][cur];
 
       int ans = 1000000001;
       for (int add = 0; add <= 1024; add++) {
           ans = Math.min(ans, recurse(idx + 1, cur ^ (a[idx] + add)) + add);
       }
       return dyn[idx][cur] = ans;
   }
 
   public int getMin(int[] A) {
       a = A;
       dyn = new int[a.length][LIM];
       for (int i = 0; i < a.length; i++)
           Arrays.fill(dyn[i], -1);
       return recurse(0, 0);
   }
}

/*
Difficulty: Hard
Time: -
Point: - of 1000
Time Complexity: O(N * maxA)
Space Complexity: O(N * maxA)
Memo: Red the answer
*/