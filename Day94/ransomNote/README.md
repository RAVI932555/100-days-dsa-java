# 📝 Ransom Note

## 📖 Problem

Given two strings `ransomNote` and `magazine`,
return `true` if `ransomNote` can be constructed using letters from `magazine`.

Each letter in `magazine` can be used **only once**.

---

## 🧠 Approach (Frequency Count)

### Steps:

1. Create frequency array/map for `magazine`
2. Traverse `ransomNote`:

   * Decrease count for each character
   * If count < 0 → return false
3. If all characters matched → return true

---

## 💡 Example

Input

```text id="rn1"
ransomNote = "aa"
magazine = "aab"
```

Output

```text id="rn2"
true
```

---

## ⏱ Time Complexity

O(n + m)

## 💾 Space Complexity

O(1)

---

## 🔑 Concepts Used

* Hashing
* Frequency array
* String traversal
