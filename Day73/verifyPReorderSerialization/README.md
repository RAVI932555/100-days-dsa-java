# Verify Preorder Serialization of a Binary Tree

## 📖 Problem

Given a string representing the **preorder traversal serialization** of a binary tree, verify whether it is valid.

In serialization:

* Non-null nodes are numbers
* Null nodes are represented as `#`
* Values are separated by commas

Example serialization:

```
9,3,4,#,#,1,#,#,2,#,6,#,#
```

---

## 🧠 Key Idea (Slot Concept)

Each node **occupies one slot**.

Rules:

1. Start with **1 slot** for the root.
2. When visiting a node:

   * Use **1 slot**
3. If the node is **not `#`**

   * It creates **2 new slots**

---

## 🧩 Algorithm

1. Start with `slots = 1`
2. For each node:

   * `slots--`
3. If slots become **negative → invalid**
4. If node is not `#`:

   * `slots += 2`
5. At the end:

   * slots must be **0**

---

## 💡 Example

Input

```
9,3,4,#,#,1,#,#,2,#,6,#,#
```

Output

```
true
```

Explanation
It represents a valid binary tree.

---

Invalid Example

```
1,#
```

Output

```
false
```

Because one child is missing.

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Binary Tree
* Preorder Traversal
* Greedy Counting
* Slot Method
