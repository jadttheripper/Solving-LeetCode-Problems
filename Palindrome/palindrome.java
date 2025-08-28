class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(313)); // true
        System.out.println(isPalindrome(123)); // false
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);  
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // all matched
    }
}