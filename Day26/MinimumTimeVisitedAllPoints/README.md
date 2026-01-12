# 📌 Problem: Minimum Time Visiting All Points

## Description
Given a list of points on a 2D plane, return the minimum time required to visit all points in the given order.

In one second, you can move vertically, horizontally, or diagonally by one unit.

## Pattern
Geometry / Math

## Difficulty
Easy

## Approach
1. Initialize total time as 0.
2. For each consecutive pair of points, calculate the time required.
3. The time is the maximum of the absolute differences in x and y coordinates.
4. Add this time to the total.
5. Return the total time.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Platform
LeetCode
