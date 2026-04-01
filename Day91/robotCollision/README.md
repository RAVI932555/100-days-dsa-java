# 🤖 Robot Collisions

## 📖 Problem

You are given:

* Positions of robots
* Health values
* Directions (`L` or `R`)

When two robots collide:

* The robot with **smaller health is destroyed**
* The other loses **1 health**
* If equal → both destroyed

Return the **health of remaining robots** in original order.

---

## 🧠 Approach (Stack Simulation)

### Key Idea:

Only robots moving:

* Right (`R`) and then Left (`L`) can collide

---

## ⚙️ Steps

1. Sort robots by **position**
2. Use a **stack** to track robots moving right (`R`)
3. Traverse robots:

   * If direction = `R` → push to stack
   * If direction = `L`:

     * While stack not empty and collision possible:

       * Compare health
       * Resolve collision:

         * Smaller dies
         * Larger loses 1 health
         * Equal → both removed

---

## 💡 Example

Input

```text id="rc1"
positions = [3,5,2,6]
health = [10,10,15,12]
directions = "RLRL"
```

Output

```text id="rc2"
[14]
```

---

## ⏱ Time Complexity

O(n log n) (sorting)

## 💾 Space Complexity

O(n)

---

## 🔑 Concepts Used

* Stack
* Simulation
* Sorting
* Collision logic
