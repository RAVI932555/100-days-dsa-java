# 🌲 Subtree of Another Tree

## 📖 Problem Statement
Given the roots of two binary trees `root` and `subRoot`, 
return true if there is a subtree of `root` that is identical to `subRoot`.

---

## 🧠 Approach

1. Traverse main tree.
2. At each node:
   - Check if trees are identical.
3. Use helper function to compare:
   - If both nodes are null → true
   - If one is null → false
   - If values differ → false
   - Recursively compare left and right children

---

## 💡 Key Concepts

- Tree traversal (DFS)
- Tree comparison
- Recursion
- Structural equality check

---

## ⏱ Time Complexity
O(m × n)

## 💾 Space Complexity
O(h)

---

## 🚀 Example

root:
      3
     / \
    4   5
   / \
  1   2

subRoot:
    4
   / \
  1   2

Output:
true