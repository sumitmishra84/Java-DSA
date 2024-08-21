public class MaxConsecutive {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};  // Example input array
        int max = 0, count = 0;
        
        for (int x : nums) {
            if (x == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        
        System.out.println("Maximum number of consecutive 1s: " + max);
    }
}
