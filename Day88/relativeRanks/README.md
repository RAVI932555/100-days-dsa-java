# 🏅 Relative Ranks

## 📖 Problem

Given scores of athletes, return their ranks:

* Highest → "Gold Medal"
* 2nd → "Silver Medal"
* 3rd → "Bronze Medal"
* Others → rank number

---

## 🧠 Approach

Steps:

1. Store (score, index)
2. Sort in descending order
3. Assign ranks based on position
4. Place result using original index

---

## 💡 Example

Input

```text id="rnk1"
score = [10,3,8,9,4]
```

Output

```text id="rnk2"
["Gold Medal","5","Bronze Medal","Silver Medal","4"]
```

---

## ⏱ Time Complexity

O(n log n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Sorting
* Custom ranking
* Index mapping
