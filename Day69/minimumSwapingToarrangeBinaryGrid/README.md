# 🔄 Minimum Swaps to Arrange Binary Grid

## 📖 Problem Statement
Given an n x n binary grid, return the minimum number of row swaps 
required to arrange the grid so that for each row i,
there are at least (n - i - 1) trailing zeros.

If it is impossible, return -1.

---

## 🧠 Approach (Greedy)

1. For each row, count trailing zeros.
2. For row i, we need at least (n - i - 1) trailing zeros.
3. Find the nearest row below that satisfies the condition.
4. Swap it upward and count swaps.
5. Repeat for all rows.

If no suitable row is found → return -1.

---

## 💡 Key Concepts

- Greedy Strategy
- Matrix traversal
- Simulation
- Counting trailing zeros

---

## ⏱ Time Complexity
O(n²)

## 💾 Space Complexity
O(n)

---

## 🚀 Example

Input:
[[0,0,1],
 [1,1,0],
 [1,0,0]]

Output:
3