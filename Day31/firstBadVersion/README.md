# 📌 Problem: First Bad Version

## Description
You are given an API `isBadVersion(version)` which returns whether a version is bad.  
Find the **first bad version** that causes all following versions to be bad.

## Pattern
Binary Search

## Difficulty
Easy

## Approach
1. Apply binary search on the version range.
2. Check the mid version using `isBadVersion`.
3. If mid is bad, search the left half.
4. Otherwise, search the right half.
5. Continue until the first bad version is found.

## Platform
LeetCode
