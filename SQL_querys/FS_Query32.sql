/* Find the department that has the most employees.

Expected Output Columns:
------------------------
+--------+----------------+
| deptno | employee_count |
+--------+----------------+

*/
USE test;
SELECT deptno , count(*) as employee_count  FROM emp 
GROUP BY deptno 
ORDER BY employee_count DESC LIMIT 1;