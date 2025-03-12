/* Find the name and salary of the highest-paid employee.

Expected Output Columns:
------------------------
+-------+---------+
| ename | sal     |
+-------+---------+

*/
USE test;
SELECT ename ,sal FROM emp ORDER BY sal desc LIMIT 1;