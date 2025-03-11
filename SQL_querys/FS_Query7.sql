/* Retrieve employees who were hired between the years 1995 and 1999.

Expected Output Columns:
+--------+----------+
| ename  | hiredate |
+--------+----------+

*/
USE test;
SELECT ename , hiredate from emp WHERE YEAR(hiredate) between 1995 and 1999;