// Problem: Two Sum
// Difficulty: Easy
// Language: java
// Approach: Use a hash map to store the numbers and their indices. For each number, calculate its complement with respect to the target. If the complement is already in the map, return the indices of the current number and its complement. Otherwise, add the current number and its index to the map and continue.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}
