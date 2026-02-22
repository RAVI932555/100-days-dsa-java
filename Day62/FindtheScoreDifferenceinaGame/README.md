# 🎮 Find the Score Difference in a Game

## 📖 Problem Statement
Given an integer array representing scores, calculate the difference between two players based on specific game rules.

(Example: One player picks even numbers and the other picks odd numbers, or based on turn logic.)

Return the score difference between Player 1 and Player 2.

---

## 🧠 Approach

1. Traverse the array.
2. Separate logic based on:
   - Even / Odd numbers
   - OR turn-based selection
3. Maintain two variables:
   - `player1Score`
   - `player2Score`
4. Return `player1Score - player2Score`.

---

## 💡 Key Concepts

- Array traversal
- Conditional logic
- Game simulation
- Edge case handling

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input: