# 📊 Find Median from Data Stream

## 📖 Problem

Design a data structure that supports:

* `addNum(int num)` → add number to stream
* `findMedian()` → return median of all elements

---

## 🧠 Approach (Two Heaps)

Use:

* **Max Heap (left)** → stores smaller half
* **Min Heap (right)** → stores larger half

---

## ⚙️ Algorithm

1. Add number:

   * Insert into max heap
   * Move top to min heap
   * Balance sizes (max heap can have +1 element)

2. Find median:

   * If sizes equal → average of both tops
   * Else → top of max heap

---

## 💡 Example

Input:

```text id="m9j2c1"
addNum(1)
addNum(2)
findMedian() → 1.5
addNum(3)
findMedian() → 2
```

---

## ⏱ Time Complexity

* addNum → O(log n)
* findMedian → O(1)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Heap (Priority Queue)
* Data Stream design
* Balancing technique
