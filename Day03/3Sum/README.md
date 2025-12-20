# 🧩 Problem: 3Sum

## 📘 Description
Given an integer array `nums`, return all the **unique triplets** `[nums[i], nums[j], nums[k]]` such that:
- `i ≠ j ≠ k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

---

## 🧪 Example
**Input:**  
nums = [-1, 0, 1, 2, -1, -4]  

**Output:**  
[[-1, -1, 2], [-1, 0, 1]]

---

## 🧠 Pattern
- Two Pointers  
- Sorting  
- Arrays  

---

## 🎯 Difficulty
Medium

---

## 🚀 Approach
- Sort the array.
- Fix one element and use **two pointers** to find remaining two numbers.
- Skip duplicate elements to avoid repeated triplets.
- Adjust pointers based on the sum comparison.

---

## ⏱️ Time Complexity
**O(n²)**

---

## 💾 Space Complexity
**O(1)** (excluding result list)

---

## 🌐 Platform
LeetCode
