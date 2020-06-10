import java.util.Arrays;
import java.util.HashSet;

public class ElevatorButtons {
    public int[] nextStops(int currentFloor, int currentDirection, int[] buttonsPressed) {
        // Remove duplicates
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int j = 0; j < buttonsPressed.length; j++) { hs.add(buttonsPressed[j]); }
        Integer[] tmp = hs.toArray(new Integer[hs.size()]);
        int[] newButtonsPressed = new int[tmp.length];
        for (int j = 0; j < tmp.length; j++) { newButtonsPressed[j] = tmp[j]; }
        int len = newButtonsPressed.length;
        
        // Sort
        Arrays.sort(newButtonsPressed);
        
        // Find closest destination floor
        int i = 0;
        while (i < len && currentFloor > newButtonsPressed[i]) { i++; }
        
        int[] nexts = new int[len];
        if (currentDirection == -1) {
            if (i > 0) { i -= 1; }
            for (int j = i, k = 0; j >= 0; j--, k++) { nexts[k] = newButtonsPressed[j]; }
            for (int j = i + 1; j < len; j++) { nexts[j] = newButtonsPressed[j]; }
        } else {
            for (int j = i, k = 0; j < len; j++, k++) { nexts[k] = newButtonsPressed[j]; }
            for (int j = i - 1, k = len - i; j >= 0; j--, k++) { nexts[k] = newButtonsPressed[j]; }
        }
        
        return nexts;
    }
}

/*
Difficulty: Easy
Time: 00:36:52
Point: 151.74 of 250
Time Complexity: O(N log N)
Space Complexity: O(N)
Memo: -
*/