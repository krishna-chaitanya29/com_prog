/* Find departments that have at least one employee earning more than 3000.

Expected Output Columns:
------------------------
+--------+------------+
| deptno | dname      |
+--------+------------+

*/
USE test;
SELECT DISTINCT d.deptno, d.dname
FROM dept d
JOIN emp e ON d.deptno = e.deptno
WHERE e.sal > 3000;