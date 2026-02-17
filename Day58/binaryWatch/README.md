# 📌 Problem: Binary Watch

## Description
A binary watch has:
- 4 LEDs for hours (0–11)
- 6 LEDs for minutes (0–59)

Given an integer `turnedOn`,  
return all possible times the watch could represent.

## Pattern
Backtracking / Bit Manipulation

## Difficulty
Easy

## Approach
1. Iterate through all possible hours (0–11).
2. Iterate through all possible minutes (0–59).
3. Count the number of set bits (1s) in hour and minute.
4. If total set bits equals `turnedOn`, format and store the time.
5. Return all valid times.

## Platform
LeetCode
