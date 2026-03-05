# Flatten Binary Tree to Linked List

## Problem

Given the root of a binary tree, flatten the tree into a **linked list in-place**.

The linked list should use the **right pointer**, and follow the same order as **preorder traversal**.

## Approach

Preorder Traversal Order:

```
Root → Left → Right
```

Steps:

1. Recursively flatten left subtree.
2. Recursively flatten right subtree.
3. Store the right subtree.
4. Move left subtree to the right.
5. Attach the original right subtree to the end.

## Example

Input

```
      1
     / \
    2   5
   / \   \
  3   4   6
```

Output

```
1 → 2 → 3 → 4 → 5 → 6
```

## Time Complexity

O(n)

## Space Complexity

O(h)

Where `h` is the height of the tree.

## Concepts Used

* Binary Tree
* Preorder Traversal
* Recursion
* Tree Manipulation
