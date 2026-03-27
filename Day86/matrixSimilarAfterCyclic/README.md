# 🔄 Matrix Similarity After Cyclic Shifts

## 📖 Problem

Given a matrix, determine whether it becomes equal to another matrix after performing cyclic shifts.

Cyclic shift means:

* Row-wise shift OR column-wise shift
* Elements wrap around

---

## 🧠 Approach

### Step 1: Understand shift pattern

For rows:

* Even rows → shift left
* Odd rows → shift right (depending on problem variation)

---

### Step 2: Simulate shift

1. For each row:

   * Compute new index after shift using modulo
2. Build transformed matrix
3. Compare with target

---

## 💡 Key Idea

Use:

```text id="g8n7ty"
newIndex = (currentIndex + shift) % n
```

---

## ⏱ Time Complexity

O(n × m)

## 💾 Space Complexity

O(n × m)

---

## 🔑 Concepts Used

* Matrix manipulation
* Modulo arithmetic
* Simulation
