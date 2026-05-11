public class BrokenArrayRotator {

    public void rotate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = nums[i];
        }