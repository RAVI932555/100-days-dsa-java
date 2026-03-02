# 🌳 Kth Smallest Element in a BST

## 📖 Problem Statement
Given the root of a Binary Search Tree (BST) and an integer k,
return the kth smallest value in the tree.

---

## 🧠 Approach

Key Observation:
Inorder traversal of BST gives sorted order.

Steps:
1. Perform inorder traversal.
2. Keep count of visited nodes.
3. When count == k → return node value.

---

## 💡 Key Concepts

- BST Property
- Inorder Traversal
- Recursion
- Counting logic

---

## ⏱ Time Complexity
O(h + k)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

Input:
      3
     / \
    1   4
     \
      2
k = 1

Output:
1