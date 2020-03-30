import java.util.HashMap;

public class AdvertisingAgency {
    public int numberOfRejections(int[] requests) {
        HashMap<Integer, Boolean> empty = new HashMap<Integer, Boolean>();
        for (int i = 1; i <= 100; i++) {
            empty.put(i, true);
        }
        
        int numRejects = 0;
        for (int i = 0; i < requests.length; i++) {
            if (empty.get(requests[i])) { empty.put(requests[i], false); }
            else { numRejects += 1; }
        }
        
        return numRejects;
    }
}

/*
Difficulty: Easy
Time: 00:08:14
Point: 235.04
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/