# 📌 Problem: Linked List Cycle II

## Description
Given the head of a linked list, return the node where the cycle begins.  
If there is no cycle, return `null`.

## Pattern
Two Pointers (Floyd’s Algorithm)

## Difficulty
Medium

## Approach
1. Use slow and fast pointers to detect a cycle.
2. Once they meet, place one pointer at the head.
3. Move both pointers one step at a time.
4. The node where they meet again is the start of the cycle.

## Platform
LeetCode
