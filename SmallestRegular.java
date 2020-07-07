import java.util.ArrayList;

public class SmallestRegular {
    public int[] findLexSmallest(String S) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = S.length();
        boolean closing = false;

        for (int indx = 0; indx < n; indx++) {
            if (S.charAt(indx) == ')')
                closing = true;
            else {
                if (closing) {
                    res.add(0);        // a
                    res.add(indx - 1); // b
                    res.add(indx);     // c
                }
            }
        }
        int[] ans = new int[res.size()];

        for(int i = 0; i < res.size(); i++)
        {
            ans[i] = res.get(i);
        }
        return ans;
    }
}

/*
Difficulty: Medium
Time: -
Point: - of 250
Time Complexity: O(O)
Space Complexity: O(O)
Memo: Red the answer
*/