# 📌 Problem: Linked List Cycle

## Description
Given the head of a linked list, determine if the linked list has a cycle in it.  
A cycle exists if some node in the list can be reached again by continuously following the `next` pointer.

## Pattern
Two Pointers (Floyd’s Cycle Detection)

## Difficulty
Easy

## Approach
1. Use two pointers:
   - `slow` moves one step at a time
   - `fast` moves two steps at a time
2. If there is a cycle, the `slow` and `fast` pointers will meet.
3. If `fast` reaches `null`, no cycle exists.

## Platform
LeetCode
