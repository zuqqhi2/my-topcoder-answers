import java.util.HashMap;

public class PosNegDice {
    public int[] evaluateRoll(int T, int[] positiveDice, int[] negativeDice) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int i = 0; i < positiveDice.length; i++) {
            if (freq.containsKey(positiveDice[i])) {
                freq.put(positiveDice[i], freq.get(positiveDice[i]) + 1);
            } else {
                freq.put(positiveDice[i], 1);
            }
        }
        
        int stress = 0;
        for (int i = 0; i < negativeDice.length; i++) {
            if (freq.containsKey(negativeDice[i]) && freq.get(negativeDice[i]) > 0) {
                freq.put(negativeDice[i], freq.get(negativeDice[i]) - 1);
            } else {
                stress += 1;
            }
        }
        
       	int success = 0;
        for (Integer key : freq.keySet()) {
            if (freq.get(key) > 0 && key <= T) {
                success += 1;
            }
        }
        if (success > 0) { success = 1; }
        
        int[] result = new int[2];
        result[0] = success;
        result[1] = stress;
        return result;
    }
}

/*
Difficulty: Hard Div2
Time: 00:17:46
Point: 177.52 of 250
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/