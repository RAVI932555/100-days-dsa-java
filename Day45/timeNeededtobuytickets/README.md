# 📌 Problem: Time Needed to Buy Tickets

## Description
There are `n` people in a queue, each with a certain number of tickets to buy.  
Each second, the person at the front buys one ticket and moves to the back of the queue if tickets remain.

Return the time required for the person at index `k` to finish buying tickets.

## Pattern
Simulation / Queue

## Difficulty
Easy

## Approach
1. Iterate through the array of tickets.
2. For each person:
   - If index ≤ `k`, add `min(tickets[i], tickets[k])`
   - If index > `k`, add `min(tickets[i], tickets[k] - 1)`
3. Sum all contributions to get the total time.

## Platform
LeetCode
