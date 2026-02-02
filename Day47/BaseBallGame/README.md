# 📌 Problem: Baseball Game

## 🔗 Problem Link
https://leetcode.com/problems/baseball-game/

---

## 🧩 Description
You are given a list of operations representing scores in a baseball game.  
Each operation can be:
- An integer (record a new score)
- `"+"` → sum of the previous two scores
- `"D"` → double the previous score
- `"C"` → invalidate the previous score

Return the total sum of all scores after performing all operations.

---

## 🧠 DSA Pattern
- Stack
- Simulation

---

## ⚙️ Approach
1. Use a stack to keep track of valid scores.
2. Traverse each operation:
   - If it’s a number, push it onto the stack.
   - `"+"`: pop top two elements, push their sum (restore popped values).
   - `"D"`: push double of the top element.
   - `"C"`: pop the top element.
3. Sum all values remaining in the stack.

---

## 🧪 Example
**Input:**
