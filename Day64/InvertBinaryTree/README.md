
# 🔄 Invert Binary Tree

## 📖 Problem Statement
Given the root of a binary tree, invert the tree 
(left becomes right and right becomes left).

---

## 🧠 Approach

1. Use recursion.
2. Swap left and right child.
3. Recursively invert left and right subtrees.

---

## 💡 Key Concepts

- Binary Tree
- Recursion
- Tree traversal
- Swapping nodes

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

Input:
      4
     / \
    2   7
   / \ / \
  1  3 6  9

Output:
      4
     / \
    7   2
   / \ / \
  9  6 3  1