# 📌 Problem: Middle of the Linked List

## Description
Given the head of a singly linked list, return the middle node of the linked list.  
If there are two middle nodes, return the second middle node.

## Pattern
Two Pointers

## Difficulty
Easy

## Approach
1. Use two pointers:
   - `slow` moves one step
   - `fast` moves two steps
2. When `fast` reaches the end, `slow` will be at the middle.
3. Return the node pointed by `slow`.

## Platform
LeetCode
