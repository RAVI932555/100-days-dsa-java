# 🔄 Flip Square Submatrix Vertically

## 📖 Problem

Given a square submatrix inside a matrix, flip it **vertically**.

Vertical flip means:

* Top row ↔ Bottom row
* Second row ↔ Second last row

---

## 🧠 Approach

Steps:

1. Identify the boundaries of the square submatrix.
2. Use two pointers:

   * `top`
   * `bottom`
3. Swap rows:

   * matrix[top][col] ↔ matrix[bottom][col]
4. Move:

   * top++
   * bottom--

Repeat until top >= bottom.

---

## 💡 Example

Input

```id="y2mbbd"
[ [1,2,3],
  [4,5,6],
  [7,8,9] ]
```

Output (after vertical flip)

```id="aazv7k"
[ [7,8,9],
  [4,5,6],
  [1,2,3] ]
```

---

## ⏱ Time Complexity

O(n²)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Matrix manipulation
* Two-pointer technique
* In-place swapping
