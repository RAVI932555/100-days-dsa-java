# 🔁 Remove Duplicates from Sorted Array II

## 📖 Problem

Given a sorted array `nums`, remove duplicates **in-place** such that each element appears at most **twice**.

Return the new length of the array.

---

## 🧠 Approach (Two Pointer)

Key idea:
Allow **maximum 2 occurrences**.

### Steps:

1. Initialize pointer `i = 0`
2. Traverse array using `j`
3. Condition:

   * If `i < 2` OR `nums[j] != nums[i-2]`
     → assign `nums[i] = nums[j]`
     → increment `i`

---

## 💡 Example

Input

```text
nums = [0,0,1,1,1,1,2,3,3]
```

Output

```text
[0,0,1,1,2,3,3]
```

Return

```text
7
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Two pointers
* In-place array modification
* Sorted array optimization
