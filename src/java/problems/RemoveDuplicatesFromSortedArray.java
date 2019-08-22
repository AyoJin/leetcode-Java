package problems;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int res = 1;
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            while (j < len) {
                if (nums[i] != nums[j]) {
                    nums[++i] = nums[j];
                    res++;
                } else {
                    j++;
                }
                if (j == len) {
                    return res;
                }
            }
        }
        return res;
    }


}
