# 🤖 Robot Return to Origin

## 📖 Problem

Given a string `moves` consisting of:

* 'U' → up
* 'D' → down
* 'L' → left
* 'R' → right

Determine if the robot returns to the **origin (0,0)**.

---

## 🧠 Approach (Simulation)

### Steps:

1. Initialize:

```text id="rr1"
x = 0, y = 0
```

2. Traverse moves:

   * U → y++
   * D → y--
   * R → x++
   * L → x--

3. Check:

```text id="rr2"
x == 0 && y == 0
```

---

## 💡 Example

Input

```text id="rr3"
moves = "UD"
```

Output

```text id="rr4"
true
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Simulation
* Coordinate tracking
