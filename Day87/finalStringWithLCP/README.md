# 🔤 Find the String with LCP

## 📖 Problem

Given an `n x n` matrix `lcp`, where:

* `lcp[i][j]` = length of the **Longest Common Prefix** of suffixes starting at index `i` and `j`

Construct a string `s` such that:

* The LCP matrix of `s` matches the given matrix
* If multiple answers exist → return any
* If impossible → return empty string

---

## 🧠 Key Observations

1. Diagonal:

   * `lcp[i][i] = n - i` (full suffix length)

2. Symmetry:

   * `lcp[i][j] == lcp[j][i]`

3. If `lcp[i][
