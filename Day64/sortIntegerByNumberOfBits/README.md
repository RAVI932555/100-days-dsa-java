# 🔢 Sort Integers by The Number of 1 Bits

## 📖 Problem Statement
Given an integer array, sort the array in ascending order 
by the number of 1s in their binary representation.

If two numbers have the same number of 1 bits, 
sort them by their numeric value.

---

## 🧠 Approach

1. Use built-in method:
   Integer.bitCount(n)
2. Sort using custom comparator:
   - First compare bit count
   - If equal, compare actual values

---

## 💡 Key Concepts

- Bit Manipulation
- Custom Sorting
- Comparator
- Lambda expressions (Java)

---

## ⏱ Time Complexity
O(n log n)

## 💾 Space Complexity
O(1) or O(log n) depending on sorting implementation

---

## 🚀 Example

Input:
[0,1,2,3,4,5,6,7,8]

Output:
[0,1,2,4,8,3,5,6,7]