package com.leet_code;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ZeroMatrix {

	public int minFlips(int[][] mat) {
		Queue<Integer> q = new LinkedList<>();
		Set<Integer> visited = new HashSet<>();
		Integer n = mat[0].length;

		int state = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) 
					state |= 1 << (i * n + j);
			}
		}
		
		// generate masks
        int[] masks = new int[mat.length * n];
        int[][] dirs = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {

                int mask = 0;

                for (int[] d : dirs) {
                    int r = i + d[0];
                    int c = j + d[1];

                    if (r >= 0 && r < mat.length && c >= 0 && c < n) {
                        mask |= 1 << (r * n + c);
                    }
                }

                masks[i * n + j] = mask;
            }
        }

		q.add(state);
		visited.add(state);

		int lvl = 0;
		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				Integer current = q.poll();

				if (current == 0)
					return lvl;

				for (int m : masks) {
					int next = current ^ m;
					if (!visited.contains(next)) {
						q.add(next);
						visited.add(next);
					}
				}
			}
			lvl++;
		}

		return -1;
	}

}
