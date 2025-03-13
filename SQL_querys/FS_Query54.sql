/*  Write a SQL query to display the number of employees per job, sorted by job 
title alphabetically.

+-----------+----------+
| job       | COUNT(*) |
+-----------+----------+

*/
USE test; 

SELECT job,COUNT(*) FROM emp GROUP BY job Order by job ;