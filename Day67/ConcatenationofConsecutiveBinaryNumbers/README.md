# 🔢 Concatenation of Consecutive Binary Numbers

## 📖 Problem Statement
Given an integer `n`, return the decimal value of the binary string 
formed by concatenating the binary representations of 1 to n.

Since the answer may be large, return it modulo 10^9 + 7.

---

## 🧠 Approach

Instead of actually building a long binary string:

1. Maintain a running result.
2. For each number i from 1 to n:
   - Count number of bits in i.
   - Left shift result by that many bits.
   - Add i.
   - Take modulo (10^9 + 7).

Formula:
result = ((result << bits) + i) % mod

---

## 💡 Key Concepts

- Bit Manipulation
- Left Shift Operator
- Modular Arithmetic
- Optimization (Avoid String building)

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input:
n = 3

Binary sequence:
1 → 1
2 → 10
3 → 11

Concatenated:
11011

Output:
27