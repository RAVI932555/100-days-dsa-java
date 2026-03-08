# Find Unique Binary String

## 📖 Problem

Given an array of `n` **unique binary strings**, each of length `n`, return **a binary string of length n that does not appear in the array**.

There can be multiple correct answers.

---

## 🧠 Approach (Diagonal Method)

Use **Cantor's Diagonalization idea**.

Steps:

1. Create a new string.
2. For each index `i`:

   * Look at `nums[i][i]`
   * Flip the bit:

     * `0 → 1`
     * `1 → 0`
3. This guarantees the new string differs from every string in the array.

---

## 💡 Example

Input

```text
nums = ["01","10"]
```

Possible Output

```text
"11"
```

Explanation

`"11"` is not present in the given array.

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Binary strings
* Greedy construction
* Diagonalization technique
