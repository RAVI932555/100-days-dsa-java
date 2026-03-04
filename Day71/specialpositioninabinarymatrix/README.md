# 🧮 Special Positions in a Binary Matrix

## 📖 Problem Statement
Given an m x n binary matrix, return the number of positions 
that contain 1 such that all other elements in its row and column are 0.

---

## 🧠 Approach

1. Count number of 1s in each row.
2. Count number of 1s in each column.
3. A cell is special if:
   matrix[i][j] == 1
   rowCount[i] == 1
   colCount[j] == 1

---

## 💡 Key Concepts

- Matrix traversal
- Row & column counting
- Preprocessing
- Optimization

---

## ⏱ Time Complexity
O(m × n)

## 💾 Space Complexity
O(m + n)

---

## 🚀 Example

Input:
[[1,0,0],
 [0,0,1],
 [1,0,0]]

Output:
1