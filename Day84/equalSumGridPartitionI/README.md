# 🧮 Equal Sum Grid Partition I

## 📖 Problem

Given a grid, check if it can be partitioned into two parts such that:

* Sum of both parts is equal

Partition can be:

* Horizontal cut
* Vertical cut

---

## 🧠 Approach

### Step 1: Compute Total Sum

* If total sum is odd → return false

---

### Step 2: Try Horizontal Partition

1. Traverse row by row
2. Maintain prefix sum
3. If prefix == total/2 → valid

---

### Step 3: Try Vertical Partition

1. Traverse column by column
2. Maintain prefix sum
3. If prefix == total/2 → valid

---

## 💡 Example

Input:

```text id="j3u4pp"
grid = [
 [1,1],
 [1,1]
]
```

Output:

```text id="9i2nzy"
true
```

---

## ⏱ Time Complexity

O(n × m)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Prefix Sum
* Matrix traversal
* Partition logic
