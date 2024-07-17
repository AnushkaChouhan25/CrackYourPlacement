class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int max = 0;
        for(int i : prices){
            bp = Math.min(bp, i);
            max = Math.max(max, i-bp);
        }
        return max;
    }
}
