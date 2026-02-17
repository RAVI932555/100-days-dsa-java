# 📌 Problem: Simplified Fractions

## Description
Given an integer `n`,  
return a list of all simplified fractions between 0 and 1 (exclusive)  
such that the denominator is less than or equal to `n`.

A fraction is simplified if the greatest common divisor (GCD) of numerator and denominator is 1.

## Pattern
Math / GCD

## Difficulty
Medium

## Approach
1. Iterate denominator from 2 to `n`.
2. For each denominator, iterate numerator from 1 to denominator - 1.
3. Compute GCD of numerator and denominator.
4. If GCD is 1, add the fraction to the result.
5. Return the list of simplified fractions.

## Platform
LeetCode
