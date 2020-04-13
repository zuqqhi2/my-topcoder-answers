import java.util.HashSet;
import java.util.ArrayList;


public class GeometricProgressions {
	public int count(int b1, int q1, int n1, int b2, int q2, int n2) {
		HashSet<ArrayList<Long>> valSet = new HashSet<ArrayList<Long>>();
		long mod1 = 1000000007;
		long mod2 = 1000000009;
		
		long a1 = b1;
		long a2 = b1;
		while (n1 > 0) {
			ArrayList<Long> newVals = new ArrayList<Long>();
			newVals.add(a1);
			newVals.add(a2);
            valSet.add(newVals);
			a1 = a1 * q1 % mod1;
			a2 = a2 * q1 % mod2;
			n1 -= 1;
		}
		
		a1 = b2;
		a2 = b2;
		while (n2 > 0) {
			ArrayList<Long> newVals = new ArrayList<Long>();
			newVals.add(a1);
			newVals.add(a2);
            valSet.add(newVals);
			a1 = a1 * q2 % mod1;
			a2 = a2 * q2 % mod2;
			n2 -= 1;
		}
		
		return valSet.size();
    }
    
    public static void main(String[] args) {
        GeometricProgressions gp = new GeometricProgressions();
        System.out.println(gp.count(3, 2, 5, 6, 2, 5));
    }
}

/*
Difficulty: Hard
Time: -
Point: -
Time Complexity: O(N)
Space Complexity: O(N)
Memo: Read an answer
*/