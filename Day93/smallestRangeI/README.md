# 📉 Smallest Range I

## 📖 Problem

You are given an integer array `nums` and an integer `k`.

You can **add or subtract `k`** from each element once.
Return the **minimum possible difference between the maximum and minimum values** of the array.

---

## 🧠 Approach (Greedy / Math)

### Key Idea:

* After modification:

  * Minimum value can become → `min + k`
  * Maximum value can become → `max - k`

So the new range is:

```text
(max - k) - (min + k)
```

---

### Final Answer:

```text
max(0, (max - min) - 2*k)
```

* If result becomes negative → return 0

---

## 💡 Example

Input

```text
nums = [1,3,6]
k = 3
```

Steps

```text
max = 6
min = 1

(6 - 1) - 2*3 = 5 - 6 = -1 → 0
```

Output

```text
0
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Greedy
* Math optimization
* Min/Max tracking
