# Complement of Base 10 Integer

## 📖 Problem

Given a non-negative integer `n`, return its **bitwise complement**.

The complement flips all bits in the binary representation:

* `0 → 1`
* `1 → 0`

---

## 🧠 Approach

Steps:

1. Convert the number to **binary representation**.
2. Flip each bit.
3. Convert the resulting binary number back to **decimal**.

Alternative approach:

1. Find the smallest number of the form `2^k - 1` that is **greater than or equal to `n`**.
2. Compute:

```
complement = mask - n
```

---

## 💡 Example

Input

```text
n = 5
```

Binary representation

```text
101
```

Complement

```text
010
```

Output

```text
2
```

---

## ⏱ Time Complexity

O(log n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Bit Manipulation
* Binary representation
* Bit flipping
