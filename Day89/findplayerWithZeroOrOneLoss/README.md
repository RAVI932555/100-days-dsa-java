# 🏆 Find Players With Zero or One Losses

## 📖 Problem

Given matches `matches[i] = [winner, loser]`, return:

* Players with **0 losses**
* Players with **exactly 1 loss**

Return both lists in **increasing order**.

---

## 🧠 Approach

Use a **HashMap to count losses**.

### Steps:

1. Initialize:

   * `lossCount[player]`
2. For each match:

   * Ensure winner exists with 0 losses (if not present)
   * Increment loser’s loss count
3. Traverse map:

   * loss == 0 → group A
   * loss == 1 → group B
4. Sort both lists

---

## 💡 Example

Input

```text id="pl1"
matches = [[1,3],[2,3],[3,6],[5,6],[5,7]]
```

Output

```text id="pl2"
[[1,2,5],[7]]
```

---

## ⏱ Time Complexity

O(n log n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* HashMap
* Counting
* Sorting
