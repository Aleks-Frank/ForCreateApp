package org.example.wayTwo;

import java.util.HashMap;
import java.util.Map;

public class WayTwo {
    public static int[] searchSums(int[] arr, int target){
        Map<Integer, Integer> seen = new HashMap<>();
        int[] answer = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (seen.containsKey(complement)) {
                answer[0] = seen.get(complement);
                answer[1] = i;
            }

            seen.put(arr[i], i);
        }

        return answer;
    }
}
