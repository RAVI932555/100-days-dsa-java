# Kth Largest Element in an Array

## 📖 Problem

Given an integer array `nums` and an integer `k`, return the **kth largest element** in the array.

Note:
It is the **kth largest element in sorted order**, not the kth distinct element.

---

## 🧠 Approach

One simple solution is:

1. Sort the array in **descending order**.
2. Return the element at index `k - 1`.

Another efficient approach uses a **Min Heap (Priority Queue)**:

Steps:

1. Maintain a min heap of size `k`.
2. Traverse the array.
3. Insert elements into the heap.
4. If heap size exceeds `k`, remove the smallest element.
5. The heap top will be the **kth largest element**.

---

## 💡 Example

Input

```text
nums = [3,2,1,5,6,4]
k = 2
```

Output

```text
5
```

Explanation
Sorted array:

```text
[6,5,4,3,2,1]
```

The **2nd largest element** is `5`.

---

## ⏱ Time Complexity

* Sorting: **O(n log n)**
* Heap Approach: **O(n log k)**

## 💾 Space Complexity

O(k)

---

## 🔑 Concepts Used

* Heap (Priority Queue)
* Sorting
* Array traversal
