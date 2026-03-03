# 🌳 Binary Tree Level Order Traversal II

## 📖 Problem Statement
Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values.

(Level order traversal from left to right, but levels should be returned from bottom to top.)

---

## 🧠 Approach (BFS - Queue)

1. Use a Queue for level order traversal.
2. Traverse level by level.
3. Store each level in a list.
4. Insert each level at the beginning of result list
   OR reverse the result at the end.

---

## 💡 Key Concepts

- Binary Tree
- Breadth First Search (BFS)
- Queue
- Level-based traversal

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(n)

---

## 🚀 Example

Input:
        3
       / \
      9   20
         /  \
        15   7

Output:
[[15,7],[9,20],[3]]