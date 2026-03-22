# 🔢 Perfect Number

## 📖 Problem

A **perfect number** is a positive integer that is equal to the sum of its **positive divisors (excluding itself)**.

Given an integer `num`, return `true` if it is a perfect number.

---

## 🧠 Approach

Steps:

1. If `num <= 1`, return false.
2. Initialize sum = 1 (since 1 is always a divisor).
3. Loop from `i = 2` to `sqrt(num)`:

   * If `i` divides `num`:

     * Add `i`
     * Add `num / i` (if different)
4. Check:

   * If sum == num → true
   * Else → false

---

## 💡 Example

Input

```id="6cklpx"
num = 28
```

Divisors:

```id="m2q0sr"
1, 2, 4, 7, 14
```

Sum:

```id="9lqj2x"
1 + 2 + 4 + 7 + 14 = 28
```

Output

```id="cfh39k"
true
```

---

## ⏱ Time Complexity

O(√n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Number theory
* Divisors
* Optimization using square root
