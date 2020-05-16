public class GoblinRabblemaster {
    public long totalDamage(int T) {
        long numGR = 0;
        long numGob = 0;
        long totalDamage = 0;
        for (int i = 0; i < T; i++) {
            numGR += 1;
            numGob += numGR;
            totalDamage += (numGR - 1) * (numGR - 2 + numGob + 2) + numGob;
        }
        
        return totalDamage;
    }
}

/*
Difficulty: Easy
Time: 00:14:17
Point: 149.12 of 250
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/
