import java.util.HashMap;

public class ValueDivision {
    public int[] getArray(int[] A) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (freq.containsKey(A[i])) {
                freq.put(A[i], freq.get(A[i]) + 1);
            } else {
                freq.put(A[i], 1);
            }
        }
        
        boolean is_subtracted = true;
        while (is_subtracted) {
            is_subtracted = false;
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 1 && freq.get(A[i]) > 1) {
                    is_subtracted = true;
                    freq.put(A[i], freq.get(A[i]) - 1);
                    A[i] -= 1;
                    if (freq.containsKey(A[i])) {
                        freq.put(A[i], freq.get(A[i]) + 1);
                    } else {
                        freq.put(A[i], 1);
                    }
                    
                    break;
                }
            }
        }
        
        return A;
    }
}

/*
Difficulty: Hard Div2
Time: 00:26:08
Point: 632.32 of 1000
Time Complexity: O(N)
Space Complexity: O(N)
Memo: When I click system test button, "success" first and later "failed"
*/