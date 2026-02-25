# 🌳 Path Sum

## 📖 Problem Statement
Given the root of a binary tree and an integer targetSum, 
return true if the tree has a root-to-leaf path such that 
adding up all the values along the path equals targetSum.

---

## 🧠 Approach

1. Use DFS (Depth First Search).
2. Subtract current node value from targetSum.
3. If we reach a leaf node:
   - Check if remaining targetSum equals node value.
4. Recursively check left and right subtrees.

---

## 💡 Key Concepts

- Binary Tree
- DFS Traversal
- Recursion
- Backtracking logic

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)  (h = height of tree)

---

## 🚀 Example

Input:
        5
       / \
      4   8
     /   / \
    11  13  4
   /  \
  7    2

targetSum = 22

Output:
true