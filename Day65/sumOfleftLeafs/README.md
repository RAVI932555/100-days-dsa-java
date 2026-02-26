# 🌿 Sum of Left Leaves

## 📖 Problem Statement
Given the root of a binary tree, return the sum of all left leaf nodes.

A left leaf is a node that:
- Is a left child
- Has no children

---

## 🧠 Approach

1. Traverse tree using DFS.
2. If node.left exists:
   - Check if it is a leaf.
   - If yes, add its value.
3. Recursively check left and right subtree.

---

## 💡 Key Concepts

- Binary Tree
- DFS Traversal
- Leaf node detection
- Recursion

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

Input:
        3
       / \
      9   20
         /  \
        15   7

Output:
24