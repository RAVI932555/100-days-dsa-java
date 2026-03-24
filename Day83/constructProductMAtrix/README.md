# 🧮 Construct Product Matrix

## 📖 Problem

Given a matrix `grid`, construct a new matrix where each element is the **product of all other elements except itself**.

---

## 🧠 Approach (Prefix + Suffix Product)

Flatten idea applied to matrix:

1. Traverse matrix:

   * Maintain prefix product
2. Traverse reverse:

   * Maintain suffix product
3. Multiply prefix × suffix for each cell

Avoid division to handle zeros.

---

## 💡 Key Idea

Same as:
👉 Product of Array Except Self (2D version)

---

## ⏱ Time Complexity

O(n × m)

## 💾 Space Complexity

O(1) (excluding output)

---

## 🔑 Concepts Used

* Prefix product
* Suffix product
* Matrix traversal
* Optimization without division
