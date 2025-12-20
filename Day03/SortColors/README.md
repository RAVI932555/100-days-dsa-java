# 🎨 Problem: Sort Colors

## 📘 Description
Given an array `nums` containing only `0`, `1`, and `2`, sort the array **in-place** so that objects of the same color are adjacent.

Do not use the library sort function.

---

## 🧪 Example
**Input:**  
nums = [2,0,2,1,1,0]  

**Output:**  
[0,0,1,1,2,2]

---

## 🧠 Pattern
- Two Pointers  
- Dutch National Flag Algorithm  

---

## 🎯 Difficulty
Medium

---

## 🚀 Approach
- Use three pointers: `low`, `mid`, and `high`.
- Move `0`s to the beginning and `2`s to the end.
- Increment or decrement pointers based on the current value.
- Perform all operations **in-place**.

---

## ⏱️ Time Complexity
**O(n)**

---

## 💾 Space Complexity
**O(1)**

---

## 🌐 Platform
LeetCode
