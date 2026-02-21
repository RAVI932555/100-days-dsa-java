# 🔢 Prime Number of Set Bits in Binary Representation

## 📖 Problem Statement
Given two integers `left` and `right`, return the count of numbers in the range `[left, right]` whose number of set bits (1s in binary representation) is a prime number.

---

## 🧠 Approach

For each number in the range:
1. Count the number of set bits using:
   - `Integer.bitCount(n)` (Java built-in)
2. Check whether the count is a prime number.
3. Increment the result if prime.

---

## 💡 Key Concepts

- Bit Manipulation
- Binary Representation
- Prime Number Checking
- Mathematical logic

---

## ⏱ Time Complexity
O(n log n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input: