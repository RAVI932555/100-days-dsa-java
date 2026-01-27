# 📌 Problem: Intersection of Two Linked Lists

## Description
Given the heads of two singly linked lists, return the node at which the two lists intersect.  
If the two linked lists have no intersection, return `null`.

## Pattern
Two Pointers

## Difficulty
Easy

## Approach
1. Use two pointers starting at the heads of both lists.
2. Traverse both lists; when a pointer reaches the end, redirect it to the other list’s head.
3. If the lists intersect, the pointers will meet at the intersection node.
4. If not, both pointers will reach `null`.

## Platform
LeetCode
