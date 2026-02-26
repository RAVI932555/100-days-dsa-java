
---

# 📌 3️⃣ Number of Steps to Reduce a Number in Binary Representation to One – README.md

```markdown
# 🔢 Number of Steps to Reduce a Number in Binary Representation to One

## 📖 Problem Statement
Given a binary string `s`, return the number of steps to reduce it to "1".

Rules:
- If even → divide by 2
- If odd → add 1

---

## 🧠 Approach

Simulate the process:

1. Traverse from right to left.
2. Maintain a carry (for +1 operations).
3. If bit + carry is even → one step (divide by 2)
4. If bit + carry is odd → two steps (add 1 + divide)
5. Continue until leftmost bit.

---

## 💡 Key Concepts

- Binary simulation
- Carry handling
- Bit manipulation
- Greedy logic

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(1)

---

## 🚀 Example

Input:
"1101"

Output:
6