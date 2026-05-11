public class FindAllDuplicatesInArray {
    public static java.util.List<Integer> findDuplicates(int[] nums) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) result.add(Math.abs(nums[i]));
            else nums[idx] = -nums[idx];
        }
        return result;
    }
}