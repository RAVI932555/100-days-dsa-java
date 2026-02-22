package Day62.FindtheScoreDifferenceinaGame;

class Solution {
    public int scoreDifference(int[] nums) {
       long firstScore = 0;
        long secondScore = 0;
        boolean firstPlayerActive = true;

        for (int i = 0; i < nums.length; i++) {
            // Rule 1: If odd, swap roles
            if (nums[i] % 2 != 0) {
                firstPlayerActive = !firstPlayerActive;
            }

            // Rule 2: Every 6th game (index 5, 11, 17...), swap roles
            if ((i + 1) % 6 == 0) {
                firstPlayerActive = !firstPlayerActive;
            }

            // Rule 3: Active player gains points
            if (firstPlayerActive) {
                firstScore += nums[i];
            } else {
                secondScore += nums[i];
            }
        }

        return (int)(firstScore - secondScore);
    }
}