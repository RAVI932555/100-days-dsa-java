# 📌 Problem: Isomorphic Strings

## Description
Given two strings `s` and `t`, determine if they are isomorphic.  
Two strings are isomorphic if the characters in `s` can be replaced to get `t`, with a one-to-one mapping between characters.

## Pattern
Hash Map

## Difficulty
Easy

## Approach
1. Use two hash maps (or arrays) to track character mappings.
2. Map characters from `s` to `t` and `t` to `s`.
3. If a conflict in mapping occurs, return `false`.
4. If all characters follow the same mapping, return `true`.

## Platform
LeetCode
