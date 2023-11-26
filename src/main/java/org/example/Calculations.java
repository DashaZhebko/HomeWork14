package org.example;

import java.util.HashSet;

public class Calculations {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        if (jewels == null || stones == null) {
            return result;
        }

        HashSet<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        for (char stone : stones.toCharArray()) {

            if (jewelSet.contains(stone)) {
                result++;
            }
        }

        return result;
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        if (nums == null) {
            return 0;
        }

        int[] goodPairs = new int[101];

        for (int num : nums) {
            goodPairs[num]++;
        }

        for (int n : goodPairs) {
            if (n > 1) {
                count += n * (n - 1) / 2;
            }
        }

        return count;
    }

    public int maxNumberOfBalloons(String inputText) {

        if (inputText == null) {
            return 0;
        }

        int[] charCount = new int[26];


        for (char ch : inputText.toCharArray()) {
            if (Character.isLetter(ch))
                charCount[Character.toLowerCase(ch) - 'a']++;
        }

        int maxEntering = Integer.MIN_VALUE;
        maxEntering = Math.max(maxEntering, charCount['b' - 'a']);
        maxEntering = Math.max(maxEntering, charCount['a' - 'a']);
        maxEntering = Math.max(maxEntering, charCount['l' - 'a'] / 2);
        maxEntering = Math.max(maxEntering, charCount['o' - 'a'] / 2);
        maxEntering = Math.max(maxEntering, charCount['n' - 'a']);

        return maxEntering;
    }
}
