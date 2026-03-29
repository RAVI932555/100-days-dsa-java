# 🔤 Check if Strings Can be Made Equal With Operations I

## 📖 Problem

Given two strings `s1` and `s2`, check if they can be made equal using allowed swap operations.

---

## 🧠 Approach

Key idea:
Only certain indices can be swapped.

Typical pattern:

* Even indices can swap among themselves
* Odd indices can swap among themselves

---

## ⚙️ Steps

1. Extract:

   * Even index characters
   * Odd index characters
2. Sort both groups
3. Compare:

   * s1_even == s2_even
   * s1_odd == s2_odd

If both match → return true

---

## 💡 Example

Input

```text id="str1"
s1 = "abcd"
s2 = "cdab"
```

Output

```text id="str2"
true
```

---

## ⏱ Time Complexity

O(n log n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* String manipulation
* Sorting
* Index grouping
