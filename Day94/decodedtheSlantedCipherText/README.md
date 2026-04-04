# 🔐 Decode the Slanted Ciphertext

## 📖 Problem

You are given:

* An encoded string `encodedText`
* Number of rows `rows`

The string was written in a matrix row-wise and read diagonally.
Reconstruct the **original text**.

---

## 🧠 Approach (Matrix Simulation)

### Steps:

1. Compute number of columns:

```text id="dc1"
cols = encodedText.length() / rows
```

2. Fill matrix row-wise

3. Traverse diagonally:

   * Start from each column in first row
   * Move:

```text id="dc2"
(i++, j++)
```

4. Append characters

5. Remove trailing spaces

---

## 💡 Example

Input

```text id="dc3"
encodedText = "ch   ie   pr"
rows = 3
```

Matrix

```text id="dc4"
c h   i
e   p
r
```

Output

```text id="dc5"
"cipher"
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Matrix reconstruction
* Diagonal traversal
* String manipulation
