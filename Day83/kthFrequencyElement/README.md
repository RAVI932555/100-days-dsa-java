# 🔝 Top K Frequent Elements

## 📖 Problem

Given an integer array `nums`, return the `k` most frequent elements.

---

## 🧠 Approach 1 (Heap)

1. Count frequency using HashMap
2. Use Min Heap of size k
3. Keep most frequent elements

---

## 🧠 Approach 2 (Bucket Sort - Optimal)

1. Count frequencies
2. Create buckets:
   index = frequency
3. Traverse from high frequency to low
4. Collect k elements

---

## 💡 Example

Input

```text
nums = [1,1,1,2,2,3]
k = 2
```

Output

```text
[1,2]
```

---

## ⏱ Time Complexity

* Heap: O(n log k)
* Bucket: O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* HashMap
* Heap (Priority Queue)
* Bucket Sort
