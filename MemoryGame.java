import java.util.HashSet;

public class MemoryGame {
    public long countSteps(int N, int seed) {
        // Shuffle
        int[] locations = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) { locations[i] = i / 2; }
        long state = seed;
        for (int i = 2 * N - 1; i > 0; i--) {
            int j = (int)(state % (i + 1));
            int tmp = locations[j];
            locations[j] = locations[i];
            locations[i] = tmp;
    		state = (state * 1103515245 + 12345) % 2147483648L;
        }
        
        // Solution
        HashSet<Integer> memory = new HashSet<Integer>();
        int num_turns = 0;
        int idx = 0;
        while (idx < locations.length) {
            // 1st opened card is in memory
            if (memory.contains(locations[idx])) {
                // 2nd cart is previously opened card
                idx += 1;
            } else {
                memory.add(locations[idx]);
                idx += 1;
                // When 2nd card has a number in memory, opening 2 cards in memory in next turn
                if (memory.contains(locations[idx])) {
                    if (locations[idx - 1] != locations[idx]) { num_turns += 1; }
                } else {
                	memory.add(locations[idx]);
                }
                idx += 1;
            }
            num_turns += 1;
        }
        
        return num_turns;
    }
}

/*
Difficulty: Medium
Time: 00:35:35
Point: 261.71 of 500
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/