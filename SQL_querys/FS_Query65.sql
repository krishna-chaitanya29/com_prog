/* Write a SQL query to retrieve the total salary per job where the total salary 
is less than 10000, ordered by total salary descending.

+-----------+----------+
| job       | SUM(sal) |
+-----------+----------+
*/
USE test; 

SELECT job, SUM(sal)
FROM emp
GROUP BY job
HAVING SUM(sal) < 10000
ORDER BY SUM(sal) DESC;