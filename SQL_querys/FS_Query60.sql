/* Write a SQL query to list departments with an average salary above 2000, 
ordered by average salary.

+--------+-------------+
| deptno | AVG(sal)    |
+--------+-------------+

*/
USE test; 
SELECT deptno,AVG(sal) from emp GROUP BY deptno HAVING avg(sal) > 2000 ;