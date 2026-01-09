# 📌 Problem: Count and Say

## Description
The count-and-say sequence is a sequence of digit strings defined recursively.

Given a positive integer `n`, return the `n`th term of the count-and-say sequence.

## Pattern
String / Recursion

## Difficulty
Medium

## Approach
1. Start with the base string `"1"`.
2. For each iteration, read the previous string and build the next one.
3. Count consecutive identical digits and append the count followed by the digit.
4. Repeat until the `n`th term is generated.

## Time Complexity
O(n * m)  
(where `m` is the length of the generated string)

## Space Complexity
O(m)

## Platform
LeetCode
