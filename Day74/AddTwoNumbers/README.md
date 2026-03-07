# Add Two Numbers

## 📖 Problem

You are given two **non-empty linked lists** representing two non-negative integers.

The digits are stored in **reverse order**, and each node contains a single digit.

Add the two numbers and return the result as a linked list.

---

## 🧠 Approach

Simulate **digit-by-digit addition** like normal arithmetic.

Steps:

1. Traverse both linked lists.
2. Add digits along with **carry**.
3. Create a new node with `(sum % 10)`.
4. Update carry `(sum / 10)`.
5. Continue until both lists and carry are finished.

---

## 💡 Example

Input

```
l1 = [2,4,3]
l2 = [5,6,4]
```

Explanation

```
342 + 465 = 807
```

Output

```
[7,0,8]
```

---

## ⏱ Time Complexity

O(max(n, m))

## 💾 Space Complexity

O(max(n, m))

---

## 🔑 Concepts Used

* Linked List
* Carry handling
* Simulation of addition
