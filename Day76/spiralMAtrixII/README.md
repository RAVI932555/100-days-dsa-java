# Spiral Matrix II

## 📖 Problem

Given a positive integer `n`, generate an `n × n` matrix filled with elements from **1 to n²** in **spiral order**.

---

## 🧠 Approach

Use **four boundaries** to control the spiral traversal:

* `top`
* `bottom`
* `left`
* `right`

Steps:

1. Fill the **top row** from left → right.
2. Fill the **right column** from top → bottom.
3. Fill the **bottom row** from right → left.
4. Fill the **left column** from bottom → top.
5. After each step, adjust the boundaries.

Repeat until all numbers are filled.

---

## 💡 Example

Input

```text
n = 3
```

Output

```text
[
 [1,2,3],
 [8,9,4],
 [7,6,5]
]
```

---

## ⏱ Time Complexity

O(n²)

## 💾 Space Complexity

O(n²)

---

## 🔑 Concepts Used

* Matrix traversal
* Simulation
* Boundary control
