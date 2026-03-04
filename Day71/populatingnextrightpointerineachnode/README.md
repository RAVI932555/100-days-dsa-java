# 🔗 Populating Next Right Pointers in Each Node

## 📖 Problem Statement
Given a perfect binary tree, populate each next pointer to point 
to its next right node. If there is no next right node, set it to NULL.

---

## 🧠 Approach (Level Order Traversal)

Method 1: BFS (Queue)
1. Traverse level by level.
2. Connect nodes in same level.
3. Last node's next → null.

Method 2 (Optimized - O(1) space for perfect tree):
1. Use already established next pointers.
2. Connect left.next = right
3. Connect right.next = next.left (if exists)

---

## 💡 Key Concepts

- BFS
- Level Order Traversal
- Tree pointer manipulation
- Constant space optimization

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1) (optimized version)

---

## 🚀 Example

Input:
        1
       / \
      2   3
     / \ / \
    4  5 6  7

Output:
4 → 5 → 6 → 7