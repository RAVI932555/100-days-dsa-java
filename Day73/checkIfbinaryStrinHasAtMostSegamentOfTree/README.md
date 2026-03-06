# Check if Binary String Has at Most One Segment of Ones

## 📖 Problem

Given a binary string `s`, check if it contains **at most one contiguous segment of '1's**.

Return **true** if there is only one segment of `1`s, otherwise return **false**.

---

## 🧠 Approach

A binary string has **more than one segment of 1s** if we see the pattern:

```
10...01
```

That means a `1` appears **after** a `0` once a segment of `1`s has ended.

Steps:

1. Traverse the string.
2. If we encounter the pattern `"01"` followed later by `1`, then multiple segments exist.
3. An easier trick: check if `"01"` exists before another `1`.

Simpler observation:

If `"01"` appears before another `1`, the answer is **false**.

Even simpler:

Check if the string contains `"01"` **before the end of ones**.

---

## 💡 Example

Input

```
s = "110"
```

Output

```
true
```

Explanation
There is only **one segment of 1s**.

---

Input

```
s = "1001"
```

Output

```
false
```

Explanation
Two segments of `1`s exist.

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* String traversal
* Pattern observation
* Greedy logic
