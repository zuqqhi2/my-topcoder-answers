public class BouncingBall {
    double freeFallDuration(double g, double h) {
        // given g and h, what is the duration of the free fall from height h to the ground?
        // this is then also the time the ball takes when thrown vertically upwards to height h (time reversal argument)
        // h = gt^2 / 2   =>   t = sqrt(2h/g)
        return Math.sqrt(2*h/g);
    }
 
    double freeFallPosition(double g, double h, double t) {
        // given g, h, t such that t <= freeFallPosition(g,h),
        // what is the position of the ball t seconds after the free fall from height h started?
        return h - g*t*t/2;
    }

    public double getPosition(int gCm, int h0, int p, int tGoal) {
        double t = 0;
        double h = h0;
        double g = gCm / 100.;
        while (true) {
            double tFall = freeFallDuration(g,h);
            if (t + tFall >= tGoal) {
                // we reach the goal time during the fall downwards
                double tDuringFall = tGoal - t;
                return freeFallPosition(g,h,tDuringFall);
            }
            t += tFall;

            // do the bounce, lose some height
            h *= (100 - p) / 100.;

            double tRise = freeFallDuration(g,h);
            if (t + tRise >= tGoal) {
                // we reach the goal time during the rise upwards
                double tDuringRise = tGoal - t;
                double tDuringFall = tRise - tDuringRise; 
                return freeFallPosition(g,h,tDuringFall);
            }
            t += tRise;
        }
    }
}

/*
Difficulty: Medium
Time: -
Point: - of 500
Time Complexity: O(N)
Space Complexity: O(N)
Memo: Red the answer
*/