# 📌 Problem: Odd Even Linked List

## Description
Given the head of a singly linked list, group all nodes with **odd indices** together followed by nodes with **even indices**.  
The relative order inside the odd and even groups should remain the same.

## Pattern
Linked List Reordering

## Difficulty
Medium

## Approach
1. Maintain two pointers:
   - `odd` for odd-indexed nodes
   - `even` for even-indexed nodes
2. Store the head of the even list.
3. Rearrange links by alternating pointers.
4. Connect the odd list to the even list at the end.

## Platform
LeetCode
