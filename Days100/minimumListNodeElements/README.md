# 🔗 Remove Linked List Elements

## 📖 Problem

Given the head of a linked list and an integer `val`,
remove all nodes with value equal to `val`.

Return the new head.

---

## 🧠 Approach (Dummy Node)

### Key Idea:

Use a **dummy node** to simplify edge cases.

---

## ⚙️ Steps

1. Create dummy node:

```text id="ll1"
dummy -> head
```

2. Traverse list:

   * If `curr.next.val == val`:
     → skip node
   * Else:
     → move forward

3. Return:

```text id="ll2"
dummy.next
```

---

## 💡 Example

Input

```text id="ll3"
head = [1,2,6,3,4,5,6]
val = 6
```

Output

```text id="ll4"
[1,2,3,4,5]
```

---

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Linked List
* Dummy node
* Pointer manipulation
