package com.array_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams_FromArray {

	public static void main(String[] args) {

		String[] a = { "eat", "tea", "tan", "ate", "nat", "bat" };

		boolean visited[] = new boolean[a.length];

		for (int i = 0; i < a.length; i++) {

			// Skip if already grouped
			if (visited[i])
				continue;

			List<String> group = new ArrayList<>();
			group.add(a[i]);
			visited[i] = true;

			char[] first = a[i].toCharArray();
			Arrays.sort(first);

			for (int j = i + 1; j < a.length; j++) {

				if (!visited[j] && a[i].length() == a[j].length()) {

					char[] second = a[j].toCharArray();
					Arrays.sort(second);

					if (Arrays.equals(first, second)) {
						group.add(a[j]);
						visited[j] = true;
					}
				}
			}

			System.out.println(group);

		}

	}
}
