# Problem: Length of Last Word

## Description
Given a string `s` consisting of words and spaces,  
return the length of the **last word** in the string.

A word is defined as a maximal substring consisting of non-space characters only.

## Pattern
Strings

## Difficulty
Easy

## Approach
1. Start traversing the string from the end.
2. Skip any trailing spaces.
3. Count characters until a space is encountered.
4. Return the count as the length of the last word.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
