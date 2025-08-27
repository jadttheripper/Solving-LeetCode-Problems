class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 7};
        int targ = 9;

        int[] result = twoSum(arr, targ);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return immediately after finding solution
                }
            }
        }
        return new int[]{}; 
    }
}