# 🧮 Equal Sum Grid Partition II

## 📖 Problem

Given a grid, determine if it can be partitioned into two parts such that:

* Both parts have **equal sum**
* You are allowed **more flexible partitioning constraints** compared to Part I
  (may include removing a single element or handling edge constraints depending on variation)

---

## 🧠 Approach

### Step 1: Compute Total Sum

* Let total = sum of all elements
* If total is odd → return false

Target = total / 2

---

### Step 2: Prefix Sum Traversal

Check possible partitions:

#### 1. Horizontal Cut

* Traverse rows
* Maintain prefix sum
* If prefix == target → valid

#### 2. Vertical Cut

* Traverse columns
* Maintain prefix sum
* If prefix == target → valid

---

### Step 3: Extended Condition (Part II Logic)

If direct partition is not possible:

* Check if removing **one element** can balance both sides
* Use HashSet / frequency tracking to verify:

  * (prefix - element) == target
    OR
  * (remaining + element) == target

---

## 💡 Key Concepts

* Prefix Sum (2D thinking)
* Hashing / Frequency tracking
* Edge case handling
* Matrix traversal
* Optimization

---

## ⏱ Time Complexity

O(n × m)

## 💾 Space Complexity

O(n × m) or O(min(n, m)) (depending on optimization)

---

## 🚀 Example

Input:

```
grid = [
 [1,2,3],
 [3,2,1]
]
```

Output:

```
true
```

---

## 🔑 Concepts Used

* Prefix Sum
* HashSet
* Matrix partitioning
* Problem extension handling
