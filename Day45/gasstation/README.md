# 📌 Problem: Gas Station

## Description
There are `n` gas stations along a circular route, where `gas[i]` is the amount of gas at station `i`  
and `cost[i]` is the cost to travel from station `i` to the next station.

Return the starting gas station’s index if you can travel around the circuit once, otherwise return `-1`.

## Pattern
Greedy

## Difficulty
Medium

## Approach
1. Track total gas and total cost.
2. If total gas is less than total cost, return `-1`.
3. Traverse the stations and maintain a current balance.
4. If the balance becomes negative:
   - Reset the balance
   - Set the next station as the new starting point
5. Return the starting index.

## Platform
LeetCode
