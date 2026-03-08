# Find All Numbers Disappeared in an Array

## 📖 Problem

Given an array `nums` of size `n` where:

* `1 ≤ nums[i] ≤ n`
* Some elements appear **twice**
* Others appear **once**

Find all numbers in the range `[1, n]` that **do not appear** in the array.

---

## 🧠 Approach

We can solve this problem using **index marking**.

Steps:

1. Iterate through the array.
2. For each number `x`, mark the index `abs(x) - 1` as **visited** by making the value negative.
3. After marking all elements:

   * Any index with a **positive value** means the number `(index + 1)` is missing.

---

## 💡 Example

Input

```text
nums = [4,3,2,7,8,2,3,1]
```

Output

```text
[5,6]
```

Explanation

Numbers **5 and 6** are missing from the array.

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1) (excluding output list)

---

## 🔑 Concepts Used

* Array traversal
* Index marking
* In-place modification
