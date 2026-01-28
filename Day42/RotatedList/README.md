# 📌 Problem: Rotate List

## Description
Given the head of a linked list, rotate the list to the right by `k` places.

## Pattern
Linked List Manipulation

## Difficulty
Medium

## Approach
1. Compute the length of the linked list.
2. Connect the last node to the head to form a circular list.
3. Find the new tail at position `length - (k % length)`.
4. Break the circle and set the new head.
5. Return the rotated list.

## Platform
LeetCode
