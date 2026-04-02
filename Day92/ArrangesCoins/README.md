# 🪙 Arranging Coins

## 📖 Problem

You have `n` coins.
You want to build a staircase:

* Row 1 → 1 coin
* Row 2 → 2 coins
* Row 3 → 3 coins

Return the **number of complete rows**.

---

## 🧠 Approach 1 (Math)

Solve:

```text
k(k + 1) / 2 ≤ n
```

Find maximum `k`

---

## 🧠 Approach 2 (Binary Search)

1. Search k in range [1, n]
2. Check:

   * mid(mid+1)/2 ≤ n

---

## 💡 Example

Input

```text id="ac1"
n = 5
```

Output

```text id="ac2"
2
```

Explanation
1 + 2 = 3 → complete
Next row needs 3 → not possible

---

## ⏱ Time Complexity

* Math: O(1)
* Binary Search: O(log n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Math
* Binary Search
* Arithmetic series
