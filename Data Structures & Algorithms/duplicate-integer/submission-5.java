class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        //Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return true;
                
            }
            set.add(x);
        }
        return false;
    }
}