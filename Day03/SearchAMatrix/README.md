# 🔍 Problem: Search a 2D Matrix

## 📘 Description
Given a 2D matrix where:
- Each row is sorted in ascending order.
- The first integer of each row is greater than the last integer of the previous row.

Determine whether a target value exists in the matrix.

---

## 🧪 Example
**Input:**  
matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]  
target = 3  

**Output:**  
true

---

## 🧠 Pattern
- Binary Search  
- Matrix  

---

## 🎯 Difficulty
Medium

---

## 🚀 Approach
- Treat the matrix as a **1D sorted array**.
- Apply **Binary Search** on indices.
- Convert mid index into row and column using division and modulus.

---

## ⏱️ Time Complexity
**O(log(m × n))**

---

## 💾 Space Complexity
**O(1)**

---

## 🌐 Platform
LeetCode
