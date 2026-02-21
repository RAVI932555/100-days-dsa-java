# 🔁 Special Binary String

## 📖 Problem Statement
A special binary string is defined as:

1. The number of 0s and 1s are equal.
2. Every prefix of the string has at least as many 1s as 0s.

Given a special binary string `s`, return the lexicographically largest result possible by swapping its special substrings.

---

## 🧠 Approach

- Treat the problem similar to **balanced parentheses**.
- Traverse the string and split it into valid special substrings.
- Recursively process the inner substring.
- Sort the substrings in descending order.
- Concatenate and return the result.

---

## 💡 Key Concepts

- Recursion
- Divide & Conquer
- String partitioning
- Sorting
- Balanced binary logic

---

## ⏱ Time Complexity
O(n log n)

## 💾 Space Complexity
O(n)

---

## 🚀 Example

Input: