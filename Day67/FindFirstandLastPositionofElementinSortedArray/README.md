# 🔎 Find First and Last Position of Element in Sorted Array

## 📖 Problem Statement
Given a sorted array of integers and a target value,
return the starting and ending position of the target.

If target is not found, return [-1, -1].

---

## 🧠 Approach (Binary Search - Modified)

Perform binary search twice:

1. Find first occurrence:
   - If target found, continue searching left.
2. Find last occurrence:
   - If target found, continue searching right.

This ensures O(log n) time.

---

## 💡 Key Concepts

- Binary Search
- Divide & Conquer
- Edge case handling
- Searching in sorted array

---

## ⏱ Time Complexity
O(log n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input:
nums = [5,7,7,8,8,10]
target = 8

Output:
[3,4]