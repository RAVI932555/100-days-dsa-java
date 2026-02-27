# 📊 Find Mode in Binary Search Tree

## 📖 Problem Statement
Given the root of a BST, return all values that appear most frequently (mode).

BST may contain duplicates.

---

## 🧠 Approach

Method 1 (Using HashMap):
1. Traverse tree.
2. Store frequency of each value.
3. Track maximum frequency.
4. Collect values with max frequency.

Method 2 (Optimized - Inorder Traversal):
1. Inorder traversal gives sorted order.
2. Track current value count.
3. Compare with max frequency.
4. Store modes accordingly.

---

## 💡 Key Concepts

- BST property
- Inorder traversal
- Frequency counting
- HashMap
- Recursion

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(n) (HashMap version)

---

## 🚀 Example

Input:
    1
     \
      2
     /
    2

Output:
[2]