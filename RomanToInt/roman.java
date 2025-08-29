import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));      // 3
        System.out.println(solution.romanToInt("LVIII"));    // 58
        System.out.println(solution.romanToInt("MCMXCIV"));  // 1994
    }
    
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = values.get(s.charAt(i));

            // If the current value is smaller than the next, subtract it
            if (i + 1 < s.length() && current < values.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
}