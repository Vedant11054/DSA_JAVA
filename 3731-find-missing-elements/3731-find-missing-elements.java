class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];

            while (current + 1 < nums[i + 1]) {
                current++;
                ans.add(current);
            }
        }

        return ans;
    }
}