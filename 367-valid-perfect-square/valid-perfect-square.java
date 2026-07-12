class Solution {
    public boolean isPerfectSquare(int num) {

        if (num == 1)
            return true;

        int l = 1;
        int r = num / 2;

        while (l <= r) {

            int mid = l + (r - l) / 2;
            long s= (long) mid * mid;

            if (s == num) {
                return true;
            } else if (s < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }
}