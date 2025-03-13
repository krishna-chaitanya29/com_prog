/*  Write a SQL query to find the minimum and maximum salaries per department, 
excluding department 20.

+--------+----------+----------+
| deptno | MIN(sal) | MAX(sal) |
+--------+----------+----------+

*/
USE test; 

SELECT deptno,MIN(sal),MAX(sal) FROM emp WHERE deptno != 20 GROUP BY deptno;