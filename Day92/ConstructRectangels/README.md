# 📐 Construct the Rectangle

## 📖 Problem

Given an area `area`, find two integers `L` and `W` such that:

* `L × W = area`
* `L ≥ W`
* `L - W` is minimized

---

## 🧠 Approach

### Key Idea:

Start from `sqrt(area)` and move downward.

### Steps:

1. Compute `w = sqrt(area)`
2. While `area % w != 0`:

   * Decrement `w`
3. Then:

   * `L = area / w`
   * `W = w`

---

## 💡 Example

Input

```text id="cr1"
area = 4
```

Output

```text id="cr2"
[2,2]
```

---

## ⏱ Time Complexity

O(√n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Math
* Square root optimization
* Factorization
