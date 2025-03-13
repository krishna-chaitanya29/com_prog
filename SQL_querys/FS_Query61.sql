/* Write a SQL query to display the employee count and total salary per 
department for departments with total salary over 4000.

+--------+----------+----------+
| deptno | COUNT(*) | SUM(sal) |
+--------+----------+----------+

*/
USE test; 
SELECT deptno,COUNT(*),SUM(sal) from emp GROUP BY deptno HAVING SUM(sal)>4000;