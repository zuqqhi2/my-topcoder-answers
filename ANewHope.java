public class ANewHope {
    public int count(int[] firstWeek, int[] lastWeek, int D) {
        int n = firstWeek.length;
        
        // Corner case
        boolean isSame = true;
        for (int i = 0; i < n; i++) {
            if (firstWeek[i] != lastWeek[i]) {
                isSame = false;
                break;
            }
        }
        if (isSame) { return 1; }
        
        //
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[firstWeek[i] - 1] = i;
            y[lastWeek[i] - 1] = i;
        }
        
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, x[i] - y[i]);
        }
        
        return (mx + n - D - 1) / (n - D) + 1;
    }

    public static void main(String[] args) {
        int[] firstWeek = {8,5,4,1,7,6,3,2};
        int[] lastWeek = {2,4,6,8,1,3,5,7};

        ANewHope anh = new ANewHope();
        System.out.println(anh.count(firstWeek, lastWeek, 3));
    }
}