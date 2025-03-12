/* Write a SQL query to calculate the average salary of employees with a commission.

Expected Output Columns:
------------------------
+----------------------+
| avg_salary_with_comm |
+----------------------+

*/
USE test;

SELECT avg(sal) as avg_salary_with_comm FROM emp WHERE comm IS NOT null or comm != 0;