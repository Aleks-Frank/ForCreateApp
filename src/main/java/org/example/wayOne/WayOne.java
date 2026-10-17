package org.example.wayOne;

public class WayOne {
    public static int[] searchSums(int[] arr, int target){
        int[] answer = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}
