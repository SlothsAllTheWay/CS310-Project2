# CS310 Programming Assignment 02 Summer 2020
## Tree Dictionary 

Many data (e.g, records of movies, songs, video games, etc) come with keywords so these data can be eaily found using keywords. 
You are tasked to implement a binary tree structure that allows querys composed of one or multiple keywords.
For example, you can find pokemons using their attacts as illustrated below.

```
Welcome to CS310 PA02: Tree Dictionary
Read 124 records from json/pokemon.json
Options:
	f: find records
	p: print the tree
	q: quit
> f
> Provide keywords (seprate by ,): thundershock, spark
> Found 2 records
> ... [Magnemite, (tackle, thundershock, spark)]
> ... [Magneton, (tackle, thundershock, spark, zap cannon)]
```

## Table of Contents
* [Introduction](#introduction-and-definitions)
* [Examples](#examples)
* [Tasks](#tasks)
* [Rules](#rules)
* [Submission Instructions](#submission-instructions)
* [Grading Rubric](#grading-rubric)

## Introduction and Definitions

The following code is provided to you. There are five java files: cs310pa2.java, DynamicArray.java, LinkedList.java, Record.java, and TreeDictionary.java. 

Note, we use an external library called **json-simple-1.1.1.jar**. Therefore, to compile the code from command line, you need:
```
javac -cp .:json-simple-1.1.1.jar cs310pa2.java
```

To run the code, you need:
```
java -cp .:json-simple-1.1.1.jar  cs310pa2 -name name -keyword moves -max 10 json/pokemon.json
```

A script, called ["run"](./run), is provided to help you compile and run the examples. 

## Tasks

### Coding (95 points + 20 bonus points)

These are the only files you should modify to finish the code. You are recommended to finish them in the given order below.
- _DynamicArray.java_, 15 points 
- _LinkedList.java_, 20 points 
- _TreeDictionary.java_, 60 points and 10x2 bonus points; 
	- Bonus points cannot be earned partially, i.e., either full points or no points.

See the commends in these java files for detail. 

### Complete README.txt (5 points)
You should complete the provided README.txt and submit it with the rest of the code.

## Examples

- [Example with 12 Pokemons](examples/pokemon-01.txt)
- [Example with 124 Pokemons](examples/pokemon-02.txt)
- [Example with 12 movies using genres](examples/movie-genre-01.txt)
- [Example with 369 movies using genres](examples/movie-genre-02.txt)
- [Example with 12 movies using actors](examples/movie-actors-01.txt)
- [Example with 369 movies using actors](examples/movie-actors-02.txt)
- [Example with Animal Crossing](examples/animal-crossing.txt)
- [Example with Tech Books](examples/tech-book.txt)

## Rules

### You must

1. Have a style (indentation, good variable names, etc.)
2. Comment your code well in JavaDoc style (no need to overdo it, just do it well)
3. Have code that compiles with the command: _javac -cp .:json-simple-1.1.1.jar *.java_ in your user directory

### You may 

1. Add private methods and private data

### You cannot 
1. Make your program part of a package.
2. Import any additional libraries/packages
3. Copy code from your text book _Data Structures and Problem Solving Using Java_, 4th Edition by _Mark A. Weiss_ or any other online or offine resources. 
4. Copy code from our in-class coding
4. Add public methods or public data
5. Change any given methods and data prototype

## Submission Instructions
- Use the cloud drive or some other server to backup your code!
- Remove all class files.
- Zip your user folder (not just the files) and name the zip “username-p2.zip” (no other type of archive) where “username” is your GMU username.
- Submit to blackboard.

## Grading Rubric
[back to top](#table-of-contents)

See rubrics under [Tasks](#tasks)

### No Credit
- Non submitted assignments
- Late assignments after 48 hours (**late tokens will be automatically applied**)
- Non compiling assignments
- Non-independent work
- "Hard coded" solutions
- Code that would win an obfuscated code competition with the rest of CS310 students.

### How will my assignment be graded?
- You CANNOT get points (even style/manual-inspection points) for code that doesn't compile or for submitting just the files given to you with the assignment. 

- Grading will be divided into the following portions:
  1. Manual/Automatic Testing (90%): To assess the correctness of programs by matching the outputs to the solution outputs.
  2. Manual Code Inspection (Optional):  If your code failed more than 3 out of 10 tests above, you may request a manual inspection and you will be graded based on the points assigned to each task. If you request a manual inspection, you can no longer use the score you get from "Manual/Automatic Testing"; To use this grade, your code  (a) must compile and (b) is an "honest attempt" at the assignment.
  3. Coding Style: Manual Code Inspection Rubric (10% "off the top" points)
  
Inspection Point | Points | High (all points) | Med (1/2 points) | Low (no points)
:---: | :---: | :--- | :--- | :--- 
Submission Format (Folder Structure) |  2 |  Code is in a folder which in turn is in a zip file. Folder is correctly named. | Code is not directly in user folder, but in a sub-folder. Folder name is correct or close to correct. | Code is directly in the zip file (no folder) and/or folder name is incorrect.
Code Formatting | 2 | Code has a set indentation and formatting style which is kept consistent throughout and code looks "well laid out".| Code has a mostly consistent indentation and formatting style, but one or more parts do not match.|Code indentation and formatting style changes throughout the code and/or the code looks "messy".
JavaDocs | 3 | The entire code base is well documented with meaningful comments in JavaDoc format. Each class, method, and field has a comment describing its purpose. Occasional in-method comments used for clarity. | The code base has some comments, but is lacking comments on some classes/methods/fields or the comments given are mostly "translating" the code. | The only documentation is what was in the template and/or documentation is missing from the code (e.g. taken out).
Coding conventions | 3 | Code has good, meaningful variable, method, and class names. All (or almost all) added fields and methods are properly encapsulated. For variables, only class constants are public. | Names are mostly meaningful, but a few are unclear or ambiguous (to a human reader) [and/or] Not all fields and methods are properly encapsulated. |  Names often have single letter identifiers and/or incorrect/meaningless identifiers. [Note: i/j/k acceptable for indexes.] [and/or] Many or all fields and methods are public or package default.
