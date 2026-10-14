# sdp_bridge — Assignment 3: Bridge Pattern (Game Character)

## Structure

| Role | Class |
| --- | --- |
| Abstraction | `character.GameCharacter` (abstract, holds a `Weapon`) |
| Refined Abstraction | `character.Warrior`, `character.Mage` |
| Implementor | `weapon.Weapon` (interface) |
| Concrete Implementor | `weapon.Sword`, `weapon.Bow`, `weapon.MagicStaff` |
| Client | `Main` |

## Clean Code principles

1. **Separation of abstraction and implementation**: `GameCharacter` only talks to the `Weapon` interface; `Main` never touches weapon internals, so no implementor details leak to the client.
2. **Meaningful names for roles**: the `character` package holds the abstraction side, the `weapon` package holds the implementor side, so a class's role is clear from its name and location.
3. **Small, focused classes**: a weapon only describes itself; a character only decides how its class turns weapon power into damage.
4. **No duplicated logic**: the attack message is built once in `GameCharacter.attack()`; subclasses only implement `role()` and `calculateDamage()`.
5. **Open for extension, closed for modification**: adding a new weapon (e.g. `Dagger`) or character class (e.g. `Archer`) requires no change to existing classes.
6. **No magic numbers**: bonuses are named constants (`STRENGTH_BONUS`, `INTELLIGENCE_MULTIPLIER`).