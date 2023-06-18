// import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class CountSubarraysWithGivenXOR {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		Map<Integer, Integer> visited = new HashMap<>();
        visited.put(0, 1);  // Store 0th index XOR as 0 in visited

        int cx = 0;
        int c = 0;

        for (int i = 0; i < arr.size(); i++) {
            cx ^= arr.get(i);

            int h = cx ^ x;
            if (visited.containsKey(h)) {
                c += visited.get(h);
            }

            visited.put(cx, visited.getOrDefault(cx, 0) + 1);
        }

        return c;
	}
}