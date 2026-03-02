# 🌲 Lowest Common Ancestor in BST

## 📖 Problem Statement
Given a BST and two nodes p and q,
return their Lowest Common Ancestor (LCA).

The LCA is the lowest node that has both p and q as descendants.

---

## 🧠 Approach

Since it is a BST:

- If both p and q are smaller than root → go left.
- If both are greater than root → go right.
- Otherwise → current root is LCA.

This uses BST ordering property.

---

## 💡 Key Concepts

- BST Property
- Recursive traversal
- Tree logic optimization

---

## ⏱ Time Complexity
O(h)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

Input:
        6
       / \
      2   8
     / \ / \
    0  4 7  9
       / \
      3   5

p = 2
q = 8

Output:
6