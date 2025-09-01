import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] arr = {"moe", "eom", "jad","cat","tac","atc"};
        List<List<String>> list1 = groupAnagrams(arr);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finlist = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);  
                    used[j] = true;
                }
            }

            finlist.add(group);
        }

        return finlist;
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}