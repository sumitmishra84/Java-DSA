package ARRAYLIST;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_238 {
    public int[] productExceptSelf_(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int productofbefore=1;
        int productofafter=1;
        for (int i = 0; i <n ; i++) {
            res[i]=productofbefore;
            productofbefore *=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(res));

        for (int i =n-1; i >=0 ; i--) {
            res[i] *=productofafter;
            productofafter *=nums[i];
        }
        return res;
    }
}
