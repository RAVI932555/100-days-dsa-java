# 🔢 Fizz Buzz

## 📖 Problem

Given an integer `n`, return a list of strings:

* "Fizz" → divisible by 3
* "Buzz" → divisible by 5
* "FizzBuzz" → divisible by both
* Otherwise → number itself

---

## 🧠 Approach

Simple iteration from 1 to n:

### Steps:

1. If divisible by 15 → "FizzBuzz"
2. Else if divisible by 3 → "Fizz"
3. Else if divisible by 5 → "Buzz"
4. Else → number

---

## 💡 Example

Input

```text id="fb1"
n = 5
```

Output

```text id="fb2"
["1","2","Fizz","4","Buzz"]
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Modulo operation
* Conditional logic
* Simulation
