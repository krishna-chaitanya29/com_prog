/*  Write a SQL query to list departments with more than 3 employees, ordered 
by total salary descending.

+--------+----------+----------+
| deptno | SUM(sal) | COUNT(*) |
+--------+----------+----------+

*/
USE test; 
SELECT deptno,SUM(sal),COUNT(*) FROM emp GROUP BY deptno HAVING  COUNT(*)>3 ORDER BY COUNT(*) desc ;