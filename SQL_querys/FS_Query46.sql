/* Write a SQL query to determine the minimum salary for employees hired in the 1990s.

Expected Output Columns:
------------------------
+----------------+
| min_salary_90s |
+----------------+

*/
USE test;
SELECT min(sal) FROM emp WHERE YEAR(hiredate) = 1990;