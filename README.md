# Animation Project

This is a simple animation projct where random lines are created in different sizes and sorted from shortest to longest.

A red line moving from left to right highlights through each randomly generated line and once the red line reaches the last line on the furthest right side, the line on the left side is changed to create a shortest to longest order.

All sorted lines are changed to a blue color and the moving red line will not interact with it again when it passes in another cycle.

The red line will iterate again from the leftmost line that has not been corrected, ignoring the most recently changed blue line.

There will be some lines that are the same in length but they will only exist next to each other.

Once all lines have been iterated through and are blue, the red line will stop at the last line and the animation is complete.

# Technologies Used 
- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
- ![](https://img.shields.io/badge/VSCode-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
