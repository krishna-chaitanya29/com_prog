/* Write a SQL query to show the total commission and average salary per job 
for jobs with at least 2 employees.

+----------+-----------+-------------+
| job      | SUM(comm) | AVG(sal)    |
+----------+-----------+-------------+

*/
USE test; 
SELECT job,SUM(comm),AVG(sal) FROM emp GROUP BY job HAVING count(*) >= 2;