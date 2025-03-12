/* Find the department name where ‘JONES’ works.

Expected Output Columns:
------------------------
+----------+
| dname    |
+----------+

*/
USE test;

SELECT d.dname FROM dept d
-- JOIN emp e ON d.deptno = e.deptno 
WHERE d.deptno = (SELECT deptno FROM emp WHERE ename = 'JONES');