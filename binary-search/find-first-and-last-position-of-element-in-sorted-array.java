class Solution {

    int lowerBound(int[] arr, int n, int target) {
        int s = 0, e = n - 1;
        int ans = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    int upperBound(int[] arr, int n, int target) {
        int s = 0, e = n - 1;
        int ans = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int lb = lowerBound(nums, n, target);
        int ub = upperBound(nums, n, target);

        if (lb == n || nums[lb] != target)
            return new int[]{-1, -1};

        return new int[]{lb, ub - 1};
    }
}