# 📌 Problem: Find Smallest Letter Greater Than Target

## Description
Given a sorted array of characters `letters` and a character `target`,  
return the smallest character in the array that is lexicographically greater than `target`.  
The letters wrap around.

## Pattern
Binary Search

## Difficulty
Easy

## Approach
1. Apply binary search on the `letters` array.
2. If `letters[mid] <= target`, move to the right half.
3. Otherwise, move to the left half.
4. Return `letters[left % letters.length]` to handle wrap-around.

## Platform
LeetCode
