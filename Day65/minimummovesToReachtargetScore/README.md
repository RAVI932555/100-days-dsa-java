# 🎯 Minimum Moves to Reach Target Score

## 📖 Problem Statement
You are given two integers `target` and `maxDoubles`.

You can perform the following operations:
1. Subtract 1 from target.
2. If target is even, divide it by 2 (at most `maxDoubles` times).

Return the minimum number of moves required to reach 1.

---

## 🧠 Approach (Greedy - Work Backwards)

Instead of starting from 1, start from `target`:

1. If target is even and maxDoubles > 0:
   - Divide by 2.
   - Decrease maxDoubles.
2. Otherwise:
   - Subtract 1.
3. Continue until target becomes 1.

If maxDoubles becomes 0:
   Add remaining (target - 1) to moves.

---

## 💡 Key Concepts

- Greedy Strategy
- Reverse thinking
- Mathematical optimization

---

## ⏱ Time Complexity
O(log n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input:
target = 10
maxDoubles = 4

Output:
4