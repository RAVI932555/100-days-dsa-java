# 🔐 Check If a String Contains All Binary Codes of Size K

## 📖 Problem Statement
Given a binary string `s` and an integer `k`, return `true` if every binary code of length `k` is a substring of `s`. Otherwise, return `false`.

---

## 🧠 Approach

1. Use a sliding window of size `k`.
2. Store all substrings of length `k` in a HashSet.
3. Total possible binary codes of size `k` = 2^k.
4. If the size of the set equals `2^k`, return true.

---

## 💡 Key Concepts

- Sliding Window
- HashSet
- Bit pattern counting
- Mathematical observation (2^k combinations)

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(2^k)

---

## 🚀 Example

Input: