# Problem: String Compression

## Description
Given an array of characters `chars`, compress it in-place.  
The compressed length should be returned.

## Pattern
Two Pointers / Strings

## Difficulty
Medium

## Approach
1. Use two pointers: one for reading and one for writing.
2. Count consecutive repeating characters.
3. Write the character followed by its count (if greater than 1).
4. Continue until all characters are processed.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
