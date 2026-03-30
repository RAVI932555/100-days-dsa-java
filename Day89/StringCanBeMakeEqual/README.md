# 🔤 Check if Strings Can be Made Equal With Operations II

## 📖 Problem

Given two strings `s1` and `s2`, determine if they can be made equal using allowed operations.

This version allows more flexible swaps (connected positions).

---

## 🧠 Approach (Character Frequency)

Key idea:
If operations allow sufficient swaps → order doesn't matter.

### Steps:

1. Count frequency of characters in both strings
2. Compare frequency maps
3. If equal → return true

---

## 💡 Example

Input

```text id="eq1"
s1 = "abc"
s2 = "bca"
```

Output

```text id="eq2"
true
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Hashing
* Frequency counting
* String transformation
