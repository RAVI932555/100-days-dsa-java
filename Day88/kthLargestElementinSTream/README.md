# 📊 Kth Largest Element in a Stream

## 📖 Problem

Design a class that maintains the **kth largest element** in a stream of numbers.

Operations:

* Initialize with `k` and initial array
* `add(val)` → returns kth largest element

---

## 🧠 Approach (Min Heap)

Use a **min heap of size k**:

### Steps:

1. Add elements to heap
2. If heap size > k → remove smallest
3. The top of heap = kth largest element

---

## 💡 Example

Input

```text id="a1b2c3"
k = 3
nums = [4,5,8,2]

add(3) → 4
add(5) → 5
add(10) → 5
add(9) → 8
```

---

## ⏱ Time Complexity

* add → O(log k)

## 💾 Space Complexity

O(k)

---

## 🔑 Concepts Used

* Heap (Priority Queue)
* Streaming data
* Optimization
