/*  Write a SQL query to list the total salary and employee count per job, 
excluding clerks.

+-----------+----------+----------+
| job       | SUM(sal) | COUNT(*) |
+-----------+----------+----------+

*/
USE test; 

SELECT job,SUM(sal),COUNT(*) FROM emp WHERE job != 'clerk' GROUP BY job ;