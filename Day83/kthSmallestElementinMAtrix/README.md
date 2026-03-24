# 🔢 Kth Smallest Element in a Sorted Matrix

## 📖 Problem

Given an `n x n` matrix where each row and column is sorted in ascending order,
return the **kth smallest element**.

---

## 🧠 Approach 1 (Min Heap)

1. Push first element of each row into min heap.
2. Extract min `k` times.
3. The kth extracted element is the answer.

---

## 🧠 Approach 2 (Binary Search on Value)

1. Define range:

   * low = smallest element
   * high = largest element
2. For mid:

   * Count elements ≤ mid
3. Adjust:

   * If count < k → move right
   * Else → move left

---

## 💡 Example

Input

```text
matrix = [
 [1,5,9],
 [10,11,13],
 [12,13,15]
]
k = 8
```

Output

```text
13
```

---

## ⏱ Time Complexity

* Heap: O(k log n)
* Binary Search: O(n log(max-min))

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Binary Search on Answer
* Heap (Priority Queue)
* Matrix traversal
