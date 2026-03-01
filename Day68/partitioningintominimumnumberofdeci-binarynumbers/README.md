# 🔢 Partitioning Into Minimum Number of Deci-Binary Numbers

## 📖 Problem Statement
A deci-binary number is a number composed only of digits 0 or 1.

Given a decimal string `n`,
return the minimum number of positive deci-binary numbers needed
so that they sum up to `n`.

---

## 🧠 Approach (Greedy Observation)

Key Observation:

The answer equals the maximum digit in the string.

Why?
Because each deci-binary number can contribute at most 1 per digit position.

So:
1. Traverse string.
2. Find maximum digit.
3. Return that digit as integer.

---

## 💡 Key Concepts

- Greedy Strategy
- Mathematical observation
- String traversal
- Optimization thinking

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input:
n = "32"

Output:
3

Explanation:
Maximum digit = 3
So minimum 3 deci-binary numbers are required.