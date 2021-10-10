package algorithms;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        if (nums.length == 0) {
            return 0;
        }

        while(true) {
            int m = (l + r) / 2;

            if (l > r) {
                    return nums[m] > target ? m : m + 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] == target) {
                return m;
            }
        }
    }
}
