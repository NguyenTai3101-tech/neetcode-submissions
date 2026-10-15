class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        ArrayList<Integer> listCount = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;

            } else if (nums[i] - nums[i - 1] == 1) {

                count++;

            } else {
                listCount.add(count);
                count = 1;
            }
        }
        listCount.add(count);
        return Collections.max(listCount);
    }
}
