package DSA;

import java.util.*;

public class MapHash {
    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();

        freq.put('a', 10);
        freq.put('a', freq.getOrDefault('a', 0) + 1);
        freq.put('b', freq.getOrDefault('b', 0) + 3 * 2);
        System.err.println(freq);

    }

}
