# 🔄 Determine Whether Matrix Can Be Obtained By Rotation

## 📖 Problem

Given two matrices `mat` and `target`,
check whether `target` can be obtained by rotating `mat` in multiples of 90 degrees.

---

## 🧠 Approach

There are only **4 possible rotations**:

* 0°
* 90°
* 180°
* 270°

Steps:

1. Check if `mat == target`
2. Rotate matrix by 90°
3. Check again
4. Repeat up to 4 times

---

## 🔁 Rotation Logic (90°)

To rotate matrix:

* Transpose matrix
* Reverse each row

---

## 💡 Example

Input

```id="nl9w7g"
mat = [[0,1],
       [1,0]]

target = [[1,0],
          [0,1]]
```

Output

```id="5r7b9n"
true
```

---

## ⏱ Time Complexity

O(n²)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Matrix rotation
* Transpose
* Row reversal
* Simulation
