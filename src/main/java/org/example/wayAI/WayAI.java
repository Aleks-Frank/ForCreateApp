package org.example.wayAI;

import java.util.HashMap;
import java.util.Map;

// Решение Open Cloud
public class WayAI {
    // Решение за O(n*n)
    public static int[] searchSums(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // Решение за O(n)
    public static int[] searchSumsFast(int[] arr, int target){
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            Integer j = seen.get(complement);
            if (j != null) {
                return new int[]{j, i};
            }
            seen.put(arr[i], i);
        }
        return new int[0];
    }
}
