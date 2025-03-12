/* Write a SQL query to find all employees who do not receive a commission.

Expected Output Columns:
------------------------
+-------+-------+------+
| ename | empno | comm |
+-------+-------+------+

*/
USE test;
SELECT ename,empno,comm FROM emp WHERE comm is null or comm = 0;
