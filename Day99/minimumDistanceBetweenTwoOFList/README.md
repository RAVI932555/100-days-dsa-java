# 📏 Minimum Distance Between Three Equal Elements II

## 📖 Problem

Given an array `nums`, find the **minimum distance** between indices `i < j < k` such that:

```text id="mde1"
nums[i] == nums[j] == nums[k]
```

Return the minimum distance, or `-1` if no such triplet exists.

---

## 🧠 Approach (Optimized)

### Key Idea:

Instead of checking all triplets, track indices efficiently.

---

## ⚙️ Steps

1. Use a **HashMap**:

   * key → number
   * value → list of indices

2. For each list:

   * Use sliding window of size 3
   * Compute:

```text id="mde2"
distance = indices[i+2] - indices[i]
```

3. Track minimum distance

---

## 💡 Example

Input

```text id="mde3"
nums = [1,2,1,1,3]
```

Output

```text id="mde4"
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
* Sliding window
* Index tracking
