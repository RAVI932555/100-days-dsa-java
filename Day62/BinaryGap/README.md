# 🔢 Binary Gap

## 📖 Problem Statement
Given a positive integer `n`, find the longest distance between two consecutive 1s in the binary representation of `n`.

If there are no two consecutive 1s, return 0.

---

## 🧠 Approach

1. Convert the number to binary (or process using bit shifting).
2. Track the position of each '1'.
3. Calculate the distance between consecutive 1s.
4. Keep updating the maximum distance.

---

## 💡 Key Concepts

- Bit Manipulation
- Binary Representation
- Bitwise operators (`>>`, `&`)
- Position tracking

---

## ⏱ Time Complexity
O(log n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input: