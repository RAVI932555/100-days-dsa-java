# 📏 Minimum Distance Between Three Equal Elements I

## 📖 Problem

Given an array `nums`, find the **minimum distance between indices** `i < j < k` such that:

```text id="md1"
nums[i] == nums[j] == nums[k]
```

Return the minimum distance (or `-1` if not possible).

---

## 🧠 Approach (HashMap + Index Tracking)

### Key Idea:

Track indices of each value.

---

## ⚙️ Steps

1. Create a map:

   * key → number
   * value → list of indices

2. For each list:

   * Check all triplets `(i, j, k)`
   * Compute:

```text id="md2"
distance = k - i
```

3. Take minimum distance

---

## ⚡ Optimization

Instead of all triplets:

* Use sliding window of size 3 over index list

---

## 💡 Example

Input

```text id="md3"
nums = [1,2,1,1,3]
```

Output

```text id="md4"
2
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* HashMap
* Index tracking
* Sliding window
