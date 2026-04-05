# 🔢 Maximum Product of Two Elements in an Array

## 📖 Problem

Given an integer array `nums`, choose two different indices `i` and `j` such that:

```text
(nums[i] - 1) * (nums[j] - 1)
```

is maximized.

Return the maximum value.

---

## 🧠 Approach (Find Two Maximums)

### Key Idea:

We only need the **two largest elements**.

### Steps:

1. Traverse array
2. Track:

   * max1 (largest)
   * max2 (second largest)
3. Return:

```text id="mp1"
(max1 - 1) * (max2 - 1)
```

---

## 💡 Example

Input

```text id="mp2"
nums = [3,4,5,2]
```

Output

```text id="mp3"
12
```

Explanation
(5-1) × (4-1) = 4 × 3 = 12

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Array traversal
* Greedy (local maximum)
