# Swap Nodes in Pairs

## 📖 Problem

Given a linked list, swap every two adjacent nodes and return its head.

You must solve the problem **without modifying node values**, only the nodes themselves may be changed.

---

## 🧠 Approach

Use pointer manipulation.

Steps:

1. Create a **dummy node** pointing to the head.
2. Use a pointer `prev` to track the node before the pair.
3. Identify two nodes:

   * `first`
   * `second`
4. Swap them by adjusting pointers.

Example transformation:

```
1 -> 2 -> 3 -> 4
```

After swapping:

```
2 -> 1 -> 4 -> 3
```

---

## 💡 Example

Input

```
head = [1,2,3,4]
```

Output

```
[2,1,4,3]
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Linked List
* Pointer manipulation
* Iteration
