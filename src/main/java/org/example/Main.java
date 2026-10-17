package org.example;

import org.example.wayOne.WayOne;
import org.example.wayTwo.WayTwo;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(WayTwo.searchSums(arr, target)));
    }
}
