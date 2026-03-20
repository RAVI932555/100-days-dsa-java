# 🎮 Nim Game

## 📖 Problem

You are playing a game where:

* There is a heap of `n` stones
* Each turn you can remove 1 to 3 stones
* The player who removes the last stone wins

Return true if you can win assuming both players play optimally.

---

## 🧠 Approach (Key Observation)

If `n % 4 == 0` → you lose
Otherwise → you win

Why?

* Multiples of 4 always force a losing position
* Opponent can mirror your moves

---

## 💡 Example

Input

```
n = 4
```

Output

```
false
```

---

## ⏱ Time Complexity

O(1)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Game theory
* Mathematical pattern
* Modulo logic
