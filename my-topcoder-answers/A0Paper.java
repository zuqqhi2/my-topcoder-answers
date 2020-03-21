public class A0Paper {
    public String canBuild(int[] A) {
        // Corner case
        if (A[0] > 0) { return "Possible"; }
        
        long remaining = 2;  // 2 of A1 are required
        for (int i = 1; i < A.length; i++) {
            remaining -= A[i];
            if (remaining <= 0) { return "Possible"; }
            remaining *= 2;
        }
        return "Impossible";
    }
}

/*
Difficulty: Easy
Time: 00:11:32
Point: 75.00
Time Complexity: O(N)
Space Complexity: O(1)
*/