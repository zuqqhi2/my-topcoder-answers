public class CardboardBoxes {
    public long count(long S) {
        // side surface area: 2 * height * length + 2 * height * width = 2 * height * (length + width)
        // top and bottom surface area: 2 * (2 * (width / 2) * length + 2 * width * (width / 2)) = 2 * width * (length + width)
        // total surface area: 2 * height * (length + width) + 2 * width * (length + width) = 2 * (height + width) * (length + width)
        // => S should be even number and S / 2 = (height + width) * (length + width)
        if (S % 2 == 1) { return 0; }
        S /= 2;
        
        long result = 0;
        for (long lw = 1; lw * lw <= S; lw++) {
            if (S % lw > 0) { continue; }
            result += Math.min(lw / 2, (S / lw) - 1);
            if (lw < S / lw) { result += Math.min((S / lw) / 2, (S / (S / lw)) - 1); }  // swap case
        }
        return result;
    }
}

/*
Difficulty: Hard
Time: -
Point: - of 1000
Time Complexity: O(N)
Space Complexity: O(1)
Memo: Red the answer
*/
