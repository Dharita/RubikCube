Raj has bought a new Rubik's Cube and he try to solve it day and night. Seeing this , Vikas tried to help Raj by giving him problem based on cube Rotation . To make it easier for Raj , As Raj is a beginner Vikas gave problem in square matrix instead of cube. The problem is as follows :

Vikas has N*N array of different numbers. Now he rotates the rows and columns . Raj has to stay focused and tell Vikas what should be output of matrix after R Rows Rotation and C columns rotation.

Raj is now more confused then ever from the above problem. Help him to find the answer.

Note: First all the rows will be rotated and then all the columns will be rotated. Rotation will be from left to right (for Rows) and Top to Bottom (for Column).

Input :

First line contain the N,R,C;
Next N lines contains N space separated integer denoting element in matrix.
Next line contains R space separated integer denoting index of Row to be rotated.(Index starts from 1).
Next line contains C space separated integer denoting index of Column to be rotated.(Index starts from 1).

Output:
Output the N*N matrix generated after above operation.
Constraints: 1<=N<=1000
1<=R,C<=100000

Example :
Test case 1:
Input :
3 1 0
1 2 3
4 5 6
7 8 9
2

Output:
1 2 3
6 4 5
7 8 9

Test case 2:
Input :
4 2 2
1 2 3 4
5 6 7 8
9 1 1 3
4 5 7 8
2 2
1 3

Output :
4 2 7 4
1 8 3 6
7 1 5 3
9 5 1 8

Test case 2:
Input :
5 3 4
8 6 3 9 1 
7 4 6 4 6 
3 4 2 0 4 
0 5 3 3 9 
8 5 4 9 3 
5 2 1 
4 5 5 4

Output :
1 8 6 3 9 
6 7 4 4 9 
3 4 2 3 9 
0 5 3 6 4 
3 8 5 0 4