public class ArrayPeakDetector {

    public int findPeak(int[] nums) {

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] > nums[i - 1] &&
                    nums[i] > nums[i + 1]) {

                return nums[i];
            }
        }

        return -1;
    }
}