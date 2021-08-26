package algorithms;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        int lastElement = -101;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastElement) {
                lastElement = nums[i];
                nums[k] = lastElement;
                k++;
            }
        }

        return k;
    }
}
