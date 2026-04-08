# ⚡ XOR After Range Multiplication Queries I

## 📖 Problem

You are given:

* An array `nums`
* A list of queries `[l, r, x]`

For each query:

* Multiply all elements in range `[l, r]` by `x`

After processing all queries, return the **XOR of all elements**.

---

## 🧠 Approach (Naive Simulation)

### Steps:

1. For each query:

   * Loop from `l` to `r`
   * Update:

```text id="xr1"
nums[i] = nums[i] * x
```

2. After all queries:

   * Compute XOR of entire array

---

## ⚡ Optimized Insight

Instead of updating full array repeatedly:

* Use **difference array / lazy propagation idea** (if constraints are large)
* Track multiplication effect per index

However:

* Since multiplication affects XOR non-linearly,
* Full optimization is tricky → simulation often acceptable

---

## 💡 Example

Input

```text id="xr2"
nums = [1,2,3]
queries = [[0,1,2],[1,2,3]]
```

Steps

```text id="xr3"
After Q1 → [2,4,3]
After Q2 → [2,12,9]
```

XOR

```text id="xr4"
2 ^ 12 ^ 9 = 7
```

Output

```text id="xr5"
7
```

---

## ⏱ Time Complexity

O(q × n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Simulation
* Range updates
* XOR operation
