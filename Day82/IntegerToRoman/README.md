# 🏛️ Integer to Roman

## 📖 Problem

Convert an integer `num` into its Roman numeral representation.

Roman symbols:

| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

Special combinations:

* IV (4), IX (9)
* XL (40), XC (90)
* CD (400), CM (900)

---

## 🧠 Approach (Greedy)

Use **largest value first** strategy.

### Steps:

1. Maintain arrays:

   * values = [1000, 900, 500, 400, ..., 1]
   * symbols = ["M", "CM", "D", "CD", ..., "I"]
2. Loop through values:

   * While `num >= value`

     * Append symbol
     * Reduce `num`

---

## 💡 Example

Input

```text
num = 1994
```

Process

```text
1000 → M
900  → CM
90   → XC
4    → IV
```

Output

```text
MCMXCIV
```

---

## ⏱ Time Complexity

O(1)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Greedy
* Mapping
* String building
