# 📊 Minimum Difficulty of a Job Schedule

## 📖 Problem

You are given:

* An array `jobDifficulty`
* An integer `d` (days)

You must schedule jobs in order over `d` days such that:

* Each day has at least one job
* Difficulty of a day = **maximum difficulty of a job done that day**

Return the **minimum total difficulty**.

If not possible → return `-1`.

---

## 🧠 Approach (Dynamic Programming)

### 🔑 Key Idea:

Split array into `d` partitions → minimize sum of max values.

---

## ⚙️ DP Definition

```text
dp[i][d] = minimum difficulty to schedule jobs from index i with d days remaining
```

---

## 🔁 Recurrence

For each partition:

```text
dp[i][d] = min over j:
   max(job[i..j]) + dp[j+1][d-1]
```

---

## 🧠 Steps

1. Base case:

   * If `d == 1` → take max of remaining jobs

2. Try all partitions:

   * Track current max
   * Recursively compute next

3. Use **memoization** to optimize

---

## 💡 Example

Input

```text id="jd1"
jobDifficulty = [6,5,4,3,2,1]
d = 2
```

Output

```text id="jd2"
7
```

---

## ⏱ Time Complexity

O(n² × d)

## 💾 Space Complexity

O(n × d)

---

## 🔑 Concepts Used

* Dynamic Programming
* Partition DP
* Memoization
