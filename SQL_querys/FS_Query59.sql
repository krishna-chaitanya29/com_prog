/* Write a SQL query to find the total salary per department and job
combination, excluding the president job.

+--------+----------+----------+
| deptno | job      | SUM(sal) |
+--------+----------+----------+

*/
USE test; 
SELECT deptno,job,SUM(sal) from emp WHERE job != 'PRESIDENT' GROUP BY deptno,job;