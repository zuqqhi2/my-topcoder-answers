public class ABBAReplace {
    public int countSteps(String Sprefix, int N, int seed, int threshold) {
        long state = seed;
		String S = Sprefix;
		while (S.length() < N) {
    		state = (state * 1103515245 + 12345) % (long)Math.pow(2, 31);
            if (state < threshold) { S += "A"; }
            else { S += "B"; }
        }
        
        int count = 0;
        boolean is_changed = true;
        while (is_changed) {
            is_changed = false;
        	for (int i = 1; i < N; i++) {
                String tmp = S;
                S = S.replaceAll("AB", "BA");
                if (!tmp.equals(S)) { is_changed = true; count += 1; }
            }
        }
        
        return count;
    }
}

/*
Difficulty: Medium
Time: 00:14:31
Point: 406.47 of 500
Time Complexity: O(N^2)
Space Complexity: O(N^2)
Memo: System Test = Pass ---later---> Fail
*/