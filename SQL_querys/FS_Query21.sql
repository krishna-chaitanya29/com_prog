/* Find employees who earn more than the average salary of all employees.

Expected Output Columns:
------------------------
+-------+---------+
| ename | sal     |
+-------+---------+

*/
USE test;
SELECT ename , sal FROM emp WHERE sal > (SELECT avg(sal) FROM emp);