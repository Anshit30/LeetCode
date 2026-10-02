class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sq = 0;
        while(n > 0){
            int rem = n%10;
            sum = sum + rem;
            sq = sq + rem*rem;
            n = n/10;
        }
        return sq-sum>=50;
    }
}