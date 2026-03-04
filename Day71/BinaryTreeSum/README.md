# 🌳 Binary Tree Paths

## 📖 Problem Statement

Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf node is a node with no children.

---

## 🧠 Approach (DFS + Backtracking)

1. Use Depth First Search (DFS).
2. Maintain a current path string.
3. If current node is a leaf:
   - Add path to result list.
4. Otherwise:
   - Recursively traverse left and right.
5. Build path using:
   currentPath + "->" + node.val

---

## 💡 Key Concepts

- Binary Tree
- DFS
- Backtracking
- String building
- Root-to-leaf traversal

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)

Where:
- n = number of nodes
- h = height of tree

---

## 🚀 Example

Input:
        1
       / \
      2   3
       \
        5

Output:
["1->2->5", "1->3"]

Explanation:
There are two root-to-leaf paths.