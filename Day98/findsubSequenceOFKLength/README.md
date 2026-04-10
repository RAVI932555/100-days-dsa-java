# 📊 Find Subsequence of Length K With the Largest Sum

## 📖 Problem

Given an array `nums` and an integer `k`, return a **subsequence of length k** that has the **largest possible sum**.

Return the subsequence in the **same order as the original array**.

---

## 🧠 Approach

### Step 1: Pick Top K Elements

* Pair each element with its index → `(value, index)`
* Sort by value (descending)
* Select top `k` elements

---

### Step 2: Maintain Original Order

* Sort the selected `k` elements by index
* Extract values

---

## 💡 Example

Input

```text id="fs1"
nums = [2,1,3,3]
k = 2
```

Steps

```text id="fs2"
Top 2 values → [3(index 2), 3(index 3)]
Order by index → [3,3]
```

Output

```text id="fs3"
[3,3]
```

---

## ⏱ Time Complexity

O(n log n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Sorting
* Greedy selection
* Index tracking
