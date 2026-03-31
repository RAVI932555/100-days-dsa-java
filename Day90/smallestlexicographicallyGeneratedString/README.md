# 🔤 Lexicographically Smallest Generated String

## 📖 Problem

Given constraints (like length, numeric value, or pattern),
construct the **lexicographically smallest string** that satisfies the conditions.

---

## 🧠 Approach (Greedy)

### Key Idea:

Always try to place the **smallest possible character ('a')** first,
and only increase when necessary to satisfy constraints.

---

## ⚙️ Steps (Typical Pattern)

1. Initialize result array with `'a'`
2. Calculate remaining value/constraint
3. Traverse from **right to left**:

   * Add required value (up to 25 → 'z')
   * Reduce remaining value
4. Convert array to string

---

## 💡 Example

### Case: Smallest string of length `n` with numeric value `k`

Input

```text id="l1"
n = 3, k = 27
```

Steps

```text id="l2"
Initial → "aaa" (value = 3)
Remaining = 24

Fill from right:
→ aay (add 24)
```

Output

```text id="l3"
"aay"
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Greedy
* String construction
* Reverse traversal
* Optimization
