// Problem: Two Sum
// Difficulty: Easy
// Language: cpp
// Approach: Use a hash map to store the numbers and their indices. For each number, calculate its complement with respect to the target. If the complement is found in the map, return the indices of the current number and its complement. Otherwise, store the current number and its index in the map and continue.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> numMap;
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (numMap.find(complement) != numMap.end()) {
                return {numMap[complement], i};
            }
            numMap[nums[i]] = i;
        }
        return {};
    }
};
