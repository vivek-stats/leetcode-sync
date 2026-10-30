// Problem: Two Sum
// Difficulty: Easy
// Language: typescript
// Approach: Use a hash map to store the numbers and their indices as you iterate through the array. For each number, calculate its complement with respect to the target. If the complement is already in the map, return the indices of the current number and its complement. If not, store the current number and its index in the map and continue.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
  twoSum(nums: number[], target: number): number[] {
    const numMap = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i];
      if (numMap.has(complement)) {
        return [numMap.get(complement)!, i];
      }
      numMap.set(nums[i], i);
    }

    throw new Error('No solution found');
  }
}
