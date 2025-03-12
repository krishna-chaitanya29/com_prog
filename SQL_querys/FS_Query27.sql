/* Find employees who were hired before all employees in department 30.

Expected Output Columns:
------------------------
+-------+------------+
| ename | hiredate   |
+-------+------------+

*/
USE test;
SELECT ename , hiredate FROM emp WHERE hiredate < (SELECT min(hiredate) FROM emp WHERE deptno = '30');