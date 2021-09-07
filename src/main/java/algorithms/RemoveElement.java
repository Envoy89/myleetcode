package algorithms;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int resultLength = 0;

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                resultLength++;
                nums[k] = nums[i];
                k++;
            }
        }

        return resultLength;
    }
}
