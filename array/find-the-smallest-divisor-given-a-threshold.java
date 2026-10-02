class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int start = 1;
        int end = 1000000;

        while (start <= end) {

            int mid = (start + end) / 2;
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += (int) Math.ceil((double) nums[i] / mid);
            }

            if (sum <= threshold) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}