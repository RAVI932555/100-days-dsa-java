# Intersection of Two Arrays II

## 📖 Problem

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result should appear **as many times as it shows in both arrays**.

---

## 🧠 Approach

Use a **HashMap (frequency map)**.

Steps:

1. Count the frequency of elements in `nums1`.
2. Traverse `nums2`.
3. If the element exists in the map and frequency > 0:

   * Add it to result
   * Decrease frequency

---

## 💡 Example

Input

```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Output

```
[2,2]
```

---

## ⏱ Time Complexity

O(n + m)

## 💾 Space Complexity

O(min(n, m))

---

## 🔑 Concepts Used

* HashMap
* Array traversal
* Frequency counting
