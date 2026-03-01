# 🌳 Minimum Absolute Difference in BST

## 📖 Problem Statement
Given the root of a Binary Search Tree (BST),
return the minimum absolute difference between the values of any two different nodes.

---

## 🧠 Approach

Since it is a BST:

- Inorder traversal gives sorted order.
- In a sorted list, the minimum difference will be between adjacent elements.

Steps:
1. Perform inorder traversal.
2. Track previous node value.
3. Compute difference with current node.
4. Update minimum difference.

---

## 💡 Key Concepts

- BST Property
- Inorder Traversal
- Sorted order observation
- Tree traversal optimization

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)  (h = height of tree)

---

## 🚀 Example

Input:
      4
     / \
    2   6
   / \
  1   3

Output:
1

Explanation:
Minimum difference is between 2 & 3 or 3 & 4.