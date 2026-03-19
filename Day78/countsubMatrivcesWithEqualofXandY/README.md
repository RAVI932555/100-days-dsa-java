# 🔢 Count Submatrices With Equal Frequency of X and Y

## 📖 Problem

Given a matrix containing characters (including 'X' and 'Y'),
count the number of submatrices where the frequency of 'X' and 'Y' is equal.

---

## 🧠 Approach

Key idea:
Convert the problem into a **prefix sum + subarray problem**.

Steps:

1. Convert matrix:

   * 'X' → +1
   * 'Y' → -1
   * Others → 0

2. Fix two rows (top and bottom).

3. For each column, compute cumulative sum between rows.

4. Now problem reduces to:
   👉 Count subarrays with sum = 0

5. Use HashMap to count prefix sums.

---

## 💡 Key Concepts

* Prefix Sum
* HashMap
* Matrix compression
* Subarray sum problem

---

## ⏱ Time Complexity

O(n² × m)

## 💾 Space Complexity

O(m)

---

## 🚀 Example

Input:
Matrix with X and Y values

Output:
Number of submatrices with equal X and Y

```

---




