# 📌 Problem: Most Frequent Even Element

## Description
Given an integer array `nums`, return the **most frequent even element**.  
If there are multiple elements with the same highest frequency, return the **smallest one**.  
If no even element exists, return `-1`.

## Pattern
Hash Map / Counting

## Difficulty
Easy

## Approach
1. Traverse the array and consider only even numbers.
2. Use a hash map to store the frequency of each even number.
3. Track the maximum frequency.
4. If frequencies are equal, choose the smaller even number.
5. Return the result or `-1` if no even number exists.

## Platform
LeetCode
