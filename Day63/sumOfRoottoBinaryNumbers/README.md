# 🌳 Sum of Root To Leaf Binary Numbers

## 📖 Problem Statement
You are given the root of a binary tree where each node contains either 0 or 1.

Each root-to-leaf path represents a binary number.

Return the sum of all root-to-leaf binary numbers.

---

## 🧠 Approach

1. Use DFS traversal (recursion).
2. Maintain current binary value:
   currentValue = currentValue * 2 + node.val
3. If leaf node:
   Add currentValue to total sum.
4. Return total sum.

---

## 💡 Key Concepts

- Binary Tree
- Depth First Search (DFS)
- Recursion
- Binary number formation

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)   (h = height of tree)

---

## 🚀 Example

Input: