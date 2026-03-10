# Insert Interval

## 📖 Problem

You are given a list of **non-overlapping intervals sorted by start time**.

Insert a new interval and **merge overlapping intervals if necessary**.

---

## 🧠 Approach

Steps:

1. Add all intervals that **end before the new interval starts**.
2. Merge all intervals that **overlap with the new interval**.
3. Add the merged interval.
4. Add remaining intervals.

This ensures the final list remains **sorted and non-overlapping**.

---

## 💡 Example

Input

```text
intervals = [[1,3],[6,9]]
newInterval = [2,5]
```

Output

```text
[[1,5],[6,9]]
```

Explanation
`[1,3]` and `[2,5]` overlap, so they merge into `[1,5]`.

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Array traversal
* Interval merging
* Greedy logic
