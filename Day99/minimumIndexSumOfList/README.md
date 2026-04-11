# 🔍 Minimum Index Sum of Two Lists

## 📖 Problem

Given two string arrays `list1` and `list2`, find common strings with the **minimum index sum**.

Return all such strings.

---

## 🧠 Approach (HashMap)

### Steps:

1. Store elements of `list1` in a map:

   * key → string
   * value → index

2. Traverse `list2`:

   * If element exists in map:

     * Compute index sum
     * Track minimum sum
     * Store result(s)

---

## 💡 Example

Input

```text id="mis1"
list1 = ["Shogun","Tapioca Express","Burger King","KFC"]
list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
```

Output

```text id="mis2"
["Shogun"]
```

---

## ⏱ Time Complexity

O(n + m)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* HashMap
* String comparison
* Optimization (min tracking)
