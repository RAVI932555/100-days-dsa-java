# Convert Sorted List to Binary Search Tree

## Problem

Given the head of a **sorted singly linked list**, convert it to a **height-balanced Binary Search Tree (BST)**.

A height-balanced BST ensures that the depth of the two subtrees of every node never differs by more than 1.

## Approach

1. Use **slow and fast pointers** to find the **middle element** of the linked list.
2. The middle element becomes the **root** of the BST.
3. Recursively build:

   * Left subtree from left half of the list
   * Right subtree from right half of the list

## Example

Input

```
[-10, -3, 0, 5, 9]
```

Output (BST)

```
      0
     / \
   -3   9
   /   /
 -10  5
```

## Time Complexity

O(n log n)

## Space Complexity

O(log n)

## Concepts Used

* Linked List
* Binary Search Tree
* Recursion
* Slow & Fast Pointer
