package org.example;


import java.util.Collections;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
        System.out.println(maximizeA("1234", "598"));
        System.out.println(maximizeA("9876", "123"));
        System.out.println(maximizeA("1111", "9"));
        System.out.println(maximizeA("1234", "55"));
        System.out.println(maximizeA("123", "999"));

    }

    public static String maximizeA(String A, String B) {
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (char c : B.toCharArray()) {
            maxHeap.offer(c);
        }

        char[] aChars = A.toCharArray();

        for (int i = 0; i < aChars.length && !maxHeap.isEmpty(); i++) {
            char bestDigit = maxHeap.peek();

            if (bestDigit > aChars[i]) {
                aChars[i] = maxHeap.poll();
            }
        }

        return new String(aChars);
    }
}
