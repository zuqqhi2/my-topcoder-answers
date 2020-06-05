public class EasyPartition {
    public String getPartition(int N) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < 2 * N; i++) { result.append("10"); }
        for (int i = 0; i < 4 * N; i++) { result.append("0"); }
        return result.toString();
    }
}

/*
Difficulty: Easy
Time: -
Point: -
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/