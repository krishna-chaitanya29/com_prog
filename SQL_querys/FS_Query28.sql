/* Find employees who belong to departments located in 'Dallas'.

Expected Output Columns:
------------------------
+-------+--------+
| ename | deptno |
+-------+--------+

*/
USE test;
SELECT e.ename , e.deptno FROM emp e 
JOIN dept d ON e.deptno = d.deptno 
WHERE d.location = 'Dallas';