package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Solution {
    /// По времени алгоритм занимает O(n), так как совершается один проход по полученной строке,
    /// а методы вставки, поиска первого элемента и удаление элемента занимают О(1).
    /// Стек используется, потому что закрывающая скобка относится к последней незакрытой открывающей.
    /// Это ровно LIFO, и вершина стека всегда даёт нужную скобку за O(1)
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
