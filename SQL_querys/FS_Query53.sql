/*  Write a SQL query to show the total salary per department where the 
total salary exceeds 5000, ordered by department number.

+--------+----------+
| deptno | SUM(sal) |
+--------+----------+

*/
USE test; 

SELECT deptno,SUM(sal) FROM emp GROUP BY deptno HAVING SUM(sal)>5000;