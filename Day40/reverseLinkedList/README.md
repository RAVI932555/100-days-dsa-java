# 📌 Problem: Reverse Linked List

## Description
Given the head of a singly linked list, reverse the list and return the reversed list.

## Pattern
Linked List Manipulation

## Difficulty
Easy

## Approach
1. Initialize `prev` as `null` and `curr` as `head`.
2. Store `curr.next` temporarily.
3. Reverse the link by pointing `curr.next` to `prev`.
4. Move `prev` and `curr` one step forward.
5. Continue until the list is fully reversed.
6. Return `prev` as the new head.

## Platform
LeetCode
