# Minimum Changes to Make Alternating Binary String

## Problem

Given a binary string `s`, return the **minimum number of changes** required to make the string alternating.

An alternating string has no two adjacent characters equal.

Examples of alternating strings:

* `010101`
* `101010`

## Approach

There are only **two possible alternating patterns**:

Pattern 1 → `010101...`
Pattern 2 → `101010...`

Steps:

1. Compare the string with pattern `0101...` and count mismatches.
2. Compare the string with pattern `1010...` and count mismatches.
3. Return the **minimum** of the two mismatch counts.

## Example

Input

```
s = "0100"
```

Output

```
1
```

Explanation
Change last `0` → `1` to get `0101`.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Concepts Used

* String Traversal
* Greedy
* Pattern Matching
