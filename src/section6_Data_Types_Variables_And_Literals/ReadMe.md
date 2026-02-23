# 📘 Section 6 --- Data Types, Variables and Literals (Java)

## 🎯 Learning Objectives

-   Understand Java primitive data types and variables.
-   Learn the concept of wrapper classes and their utility methods.
-   Perform type conversion and parsing between String and primitive
    types.
-   Explore numeric representations such as binary, octal, and
    hexadecimal.
-   Understand character encoding using Unicode.
-   Work with boolean operations and logical methods.
-   Learn how Java handles literals and formatted numeric values.

------------------------------------------------------------------------

# 🧩 1. Variables and Data Types

A variable is a named memory location used to store data.

Example:

int age = 25; float price = 45.50f; char grade = 'A'; boolean isActive =
true;

------------------------------------------------------------------------

# 🏗️ 2. Wrapper Classes

Java provides wrapper classes for each primitive type.

Primitive   Wrapper Class
  ----------- ---------------
byte        Byte
short       Short
int         Integer
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

Wrapper classes provide useful methods like:

-   parseInt()
-   compare()
-   toString()
-   bitCount()
-   toBinaryString()

------------------------------------------------------------------------

# 📘 Example Overview

  ------------------------------------------------------------------------
File Name             Concept         What It Contains
  --------------------- --------------- ----------------------------------
Example1.java         Variable        Declaring variables of different
Declaration &   primitive data types and assigning
Assignment      values.

Example2.java         Byte Wrapper    Demonstrates Byte constants,
Class           parsing values, and comparing
bytes.

Example3.java         Short Wrapper   Shows Short limits, parsing from
Class           strings, and comparisons.

Example4.java         Integer Wrapper Demonstrates Integer limits,
Class           parsing, bit operations, and
number system conversions.

Example5.java         Long Wrapper    Shows handling large numbers using
Class           Long and performing bit
operations.

Example6.java         Float Wrapper   Demonstrates floating point
Class           division behavior including
Infinity and NaN.

Example7.java         Double Wrapper  Shows Double parsing, comparison,
Class           and IEEE 754 raw bit
representation.

Example8.java         Character       Demonstrates Unicode characters
Wrapper Class   and character utility methods.

Example9.java         Boolean Wrapper Shows Boolean parsing, logical
Class           operations, and comparisons.

Example10.java        Numeric         Demonstrates binary, octal,
Literals &      hexadecimal literals and formatted
Formatting      numbers.

Example11.java        String Data     Demonstrates storing textual data
using the String class.
  ------------------------------------------------------------------------

------------------------------------------------------------------------

# 🔢 Numeric Literals

Java allows numbers to be written in multiple formats.

Format        Example
  ------------- -------------------
Decimal       int a = 25;
Binary        int a = 0b1010;
Octal         int a = 0734;
Hexadecimal   int a = 0xffd500;

Readable numbers using underscore:

int population = 10_00_000; float price = 1_234.567_8f;

------------------------------------------------------------------------

# 🔤 Character and Unicode

Java uses Unicode encoding allowing characters from many languages.

char english = 'A'; char hindi = 'अ'; char marathi = 'क'; char chinese =
'你';

Unicode values can also be written directly:

char rupee = '`\u2`{=tex}0B9'; char smile = '`\u2`{=tex}63A';

------------------------------------------------------------------------

# ⚙️ Boolean Operations

Boolean wrapper class provides logical utility methods.

Boolean.logicalAnd(true, false); Boolean.logicalOr(true, false);
Boolean.logicalXor(true, false);

------------------------------------------------------------------------

# 📂 Project Structure

section6_Data_Types_Variables_And_Literals

# 📘 Example Overview

| File Name | Concept | What It Contains |
| :--- | :--- | :--- |
| Example1.java | Variable Declaration & Assignment | Declaring variables of different primitive data types and assigning values. |
| Example2.java | Byte Wrapper Class | Demonstrates Byte constants, parsing values, and comparing bytes. |
| Example3.java | Short Wrapper Class | Shows Short limits, parsing from strings, and comparisons. |
| Example4.java | Integer Wrapper Class | Demonstrates Integer limits, parsing, bit operations, and number system conversions. |
| Example5.java | Long Wrapper Class | Shows handling large numbers using Long and performing bit operations. |
| Example6.java | Float Wrapper Class | Demonstrates floating point division behavior including Infinity and NaN. |
| Example7.java | Double Wrapper Class | Shows Double parsing, comparison, and IEEE 754 raw bit representation. |
| Example8.java | Character Wrapper Class | Demonstrates Unicode characters and character utility methods. |
| Example9.java | Boolean Wrapper Class | Shows Boolean parsing, logical operations, and comparisons. |
| Example10.java | Numeric Literals & Formatting | Demonstrates binary, octal, hexadecimal literals and formatted numbers. |
| Example11.java | String Data | Demonstrates storing textual data using the String class. |

------------------------------------------------------------------------

# 🧠 Key Takeaways

-   Java variables store data of specific primitive types.
-   Wrapper classes provide powerful utility methods.
-   Numbers can be represented in multiple literal formats.
-   Java characters support Unicode enabling multilingual text.
-   Boolean wrapper class supports logical operations.
