
# 🪖 The K Weakest Rows in a Matrix

## 📖 Problem
Given a binary matrix where:

- `1` represents soldiers
- `0` represents civilians

Each row is sorted (all 1s come before 0s).

Return the indices of the **k weakest rows**.

Weakness is defined by:
1. Fewer number of soldiers
2. If equal → smaller index

---

## 🧠 Approach

Steps:

1. For each row:
   - Count number of 1s (soldiers)
2. Store pair:
   (soldierCount, rowIndex)
3. Sort based on:
   - soldierCount
   - rowIndex
4. Return first k indices

---

## 💡 Key Concepts

- Matrix traversal
- Sorting with custom comparator
- Binary Search (optional optimization)
- Pair handling

---

## ⏱ Time Complexity
O(n log n)

## 💾 Space Complexity
O(n)

---

## 🚀 Example

Input:
```

mat = [[1,1,0,0],
[1,1,1,1],
[1,0,0,0],
[1,1,0,0]]

k = 2

```

Output:
```

[2,0]

```

---

## 🛠 Language Used
Java
```

---
