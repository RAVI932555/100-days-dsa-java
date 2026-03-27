# 📊 Smallest Range Covering Elements from K Lists

## 📖 Problem

You are given `k` sorted lists.
Find the smallest range `[a, b]` such that at least **one number from each list** lies within the range.

---

## 🧠 Approach (Min Heap + Sliding Window)

### Key Idea:

Always track:

* Current **minimum element**
* Current **maximum element**

---

## ⚙️ Algorithm

1. Initialize a min heap:

   * Store (value, listIndex, elementIndex)
2. Track current `max` among elements
3. Repeat:

   * Extract min element
   * Update range if smaller
   * Move pointer in that list
   * Insert next element into heap
   * Update max
4. Stop when any list is exhausted

---

## 💡 Example

Input

```text id="3l1h3n"
nums = [
 [4,10,15,24,26],
 [0,9,12,20],
 [5,18,22,30]
]
```

Output

```text id="h6j3b1"
[20,24]
```

---

## ⏱ Time Complexity

O(n log k)

## 💾 Space Complexity

O(k)

---

## 🔑 Concepts Used

* Heap (Priority Queue)
* Sliding Window idea
* Multi-pointer technique
