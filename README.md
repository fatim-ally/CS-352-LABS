UBIT-BSCS-SECTION A

*Lab04*(CuddlyToy Inheritance Project)
Class Hierarchy:

CuddlyToy (base class)
├── Teddy (inherits CuddlyToy)
│ └── EngineDriver (inherits Teddy)
└── Bunny (inherits CuddlyToy)

Features

- Use of inheritance to model a toy hierarchy.
- **Constructors** for setting up object state.
- **Method overriding**, including `toString()` and custom behavior.
- Polymorphism and clean object initialization.

📦 Classes Overview

`CuddlyToy`
Base class containing shared attributes:
- `double size`
- `String color`
- `String job`

`Teddy` & `Bunny`
Simple subclasses that inherit from `CuddlyToy`. `Teddy` is later extended by a more specialized toy.

`EngineDriver`
A specialized `Teddy` that:
- Has a constructor that sets its own values for `size`, `color`, and `job`.
- Implements a `makeNoise()` method (`System.out.println("Grrrrr")`)
- Overrides the `toString()` method to describe itself.

🖥️ Example Output

|java|
EngineDriver ed = new EngineDriver(10.5);
System.out.println(ed);
ed.makeNoise();

Output:
I am a Blue teddy bear
My job is: to drive!
My size is: 10.5.
Grrrrr
------------------------------------------------------------------------------------------------------------------------------------

*Lab05*(Triangle Class Project)
This lab implements a `Triangle` class in Java to demonstrate object-oriented programming concepts such as:

- Constructor overloading
- Cloning objects
- Static class members
- Method implementation and validation

Files:

- `Triangle.java` – Contains the `Triangle` class with methods:
  - getPerimeter()
  - isRightAngled()
  - clone()
  - Getters and Setters
  - Overridden `toString()`
  - Static `objectCount`

`Main4.java` – Tests various triangle objects and class functionality.

Features:

- Calculates triangle perimeter
- Detects right-angled triangles using the Pythagorean theorem
- Supports deep cloning
- Tracks number of triangle objects created
------------------------------------------------------------------------------------------------------------------------------------

*Lab06*(Command pattern drawing code)
(summary):
Implements a **turtle-like drawing system** using the **Command Design Pattern**. 
- Follows OOP principles with clean separation of concerns.
- Uses string input (like `"F+F+F+F"`) to direct a virtual pen.
- Includes:
  - Command classes (Forward, TurnLeft, TurnRight)
  - Parser for interpreting input
  - Controller to execute commands
  - Model class `Pen` for movement and direction

Folders: commands,controller,model,parser and a file: Main7.java
commands: Command.java,ForwardCommand.java,TurnRightCommand,TurnLeftCommand
controller: AppCntrl.java
model: Pen.java
parser: CommandParser

Features

- ✅ Accepts input strings like `F+F+F+F` to move and rotate a virtual pen
- ✅ `F` → move forward, `+` → turn right, `-` → turn left
- ✅ Clear separation between:
  - Command parsing
  - Command execution
  - Pen (drawing) logic
- ✅ Easily extendable with new commands
- ✅ Clean folder structure (`model`, `commands`, `controller`, `parser`)
CONCEPTS:
encapsulation
abstraction
inheritance
polymorphism
modularity
  
Author: Fatima Fahad Ansari
GitHub: [@fatim-ally](https://github.com/fatim-ally)

