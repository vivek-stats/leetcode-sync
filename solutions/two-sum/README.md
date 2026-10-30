# Two Sum

- **Problem ID:** `two-sum`
- **Difficulty:** Easy
- **Topics:** Array, Hash Table
- **Validated & Synced:** 2026-10-30 23:16:58 UTC

## Sandboxed Validation Summary
Solutions were executed and verified in an isolated Docker sandbox with zero network access.

- **PYTHON:** Status `passed` — 3/3 test cases passed (641 ms)
- **JAVA:** Status `passed` — 3/3 test cases passed (1462 ms)
- **CPP:** Status `passed` — 3/3 test cases passed (2429 ms)
- **TYPESCRIPT:** Status `passed` — 3/3 test cases passed (492 ms)

## Solution Implementations
### Python
- **Approach:** Hash Table
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

### Java
- **Approach:** Use a hash map to store the numbers and their indices. For each number, calculate its complement with respect to the target. If the complement is already in the map, return the indices of the current number and its complement. Otherwise, add the current number and its index to the map and continue.
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

### Cpp
- **Approach:** Use a hash map to store the numbers and their indices. For each number, calculate its complement with respect to the target. If the complement is found in the map, return the indices of the current number and its complement. Otherwise, store the current number and its index in the map and continue.
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

### Typescript
- **Approach:** Use a hash map to store the numbers and their indices as you iterate through the array. For each number, calculate its complement with respect to the target. If the complement is already in the map, return the indices of the current number and its complement. If not, store the current number and its index in the map and continue.
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

