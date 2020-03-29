public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String result = "";
        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermission) { result += "A"; }
            else { result += "D"; }
        }
        
        return result;
    }
}
 
/*
Difficulty: Easy
Time: 00:04:18
Point: 245.17
Time Complexity: O(N)
Space Complexity: O(N)
Memo: -
*/