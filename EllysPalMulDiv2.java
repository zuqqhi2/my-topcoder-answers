public class EllysPalMulDiv2 {
    private boolean isPalindrome(long XY) {
        String strXY = String.valueOf(XY);
        for (int i = 0; i < strXY.length() / 2; i++) {
            if (strXY.charAt(i) != strXY.charAt(strXY.length() - 1 - i)) { return false; }
        }
        return true;
    }
    
    public int getMin(int X) {
        if (X % 10 == 0) { return -1; }
        
        for (int Y = 1; Y <= 1000; Y++) {
            if (this.isPalindrome(X * Y)) { return Y; }
        }
        return -1;
    }
}

/*
Difficulty: Easy
Time: 00:15:08
Point: 200.38 of 250
Time Complexity: O(N)
Space Complexity: O(1)
Memo: -
*/