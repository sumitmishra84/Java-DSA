package ARRAYLIST;

public class practice {
    public int[] productExceptSelf_(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            res[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products and final result
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
}
