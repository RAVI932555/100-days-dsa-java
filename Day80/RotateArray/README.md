# 🔁 Rotate Array

## 📖 Problem

Given an array, rotate it to the right by `k` steps.

---

## 🧠 Approach (Optimal - Reverse Method)

Steps:

1. Reverse entire array
2. Reverse first `k` elements
3. Reverse remaining `n - k` elements

---

## 💡 Example

Input

```id="ffr7mo"
nums = [1,2,3,4,5,6,7]
k = 3
```

Steps:

```id="nl1vfi"
[7,6,5,4,3,2,1]   (reverse all)
[5,6,7,4,3,2,1]   (reverse first k)
[5,6,7,1,2,3,4]   (reverse rest)
```

Output

```id="j3i7st"
[5,6,7,1,2,3,4]
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Array manipulation
* Reversal technique
* In-place operations
