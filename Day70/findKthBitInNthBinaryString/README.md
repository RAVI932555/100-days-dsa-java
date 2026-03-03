# 🔢 Find Kth Bit in Nth Binary String

## 📖 Problem Statement

Given two integers `n` and `k`, return the kth bit in the nth binary string.

The nth binary string is defined recursively:

S1 = "0"

For i > 1:
Si = S(i-1) + "1" + reverse(invert(S(i-1)))

Where:
- reverse → reverse the string
- invert → change '0' to '1' and '1' to '0'

---

## 🧠 Key Observations

Length of Sn:
len(n) = 2^n - 1

Middle position:
mid = 2^(n-1)

Important facts:
1. Middle bit is always '1'
2. Left part = S(n-1)
3. Right part = reverse(invert(S(n-1)))

So we do NOT build the whole string.
We use recursion + position logic.

---

## 🧠 Recursive Logic

If k == mid → return '1'

If k < mid → answer = findKthBit(n-1, k)

If k > mid:
    mirror = 2^n - k
    result = findKthBit(n-1, mirror)
    return invert(result)

---

## 💡 Key Concepts

- Recursion
- Divide & Conquer
- Mathematical observation
- Bit flipping logic
- Avoid brute force string building

---

## ⏱ Time Complexity
O(n)

## 💾 Space Complexity
O(n) (recursion stack)

---

## 🚀 Example

Input:
n = 3
k = 1

S3 = "0111001"

Output:
0