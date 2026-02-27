# 🌳 Search in a Binary Search Tree

## 📖 Problem Statement
Given the root of a Binary Search Tree (BST) and an integer value, 
return the subtree rooted with the node that has the given value. 
If such a node does not exist, return null.

---

## 🧠 Approach

Since it's a BST:

- If value == root.val → return root
- If value < root.val → search left subtree
- If value > root.val → search right subtree

This works because:
Left subtree < root < Right subtree

---

## 💡 Key Concepts

- Binary Search Tree property
- Recursion
- Divide & Conquer
- Tree traversal optimization

---

## ⏱ Time Complexity
O(h)  
(h = height of tree)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

Input:
      4
     / \
    2   7
   / \
  1   3

Search value = 2

Output:
      2
     / \
    1   3