/* Write a SQL query to count the number of employees who have a manager.

Expected Output Columns:
------------------------
+------------------------+
| employees_with_manager |
+------------------------+

*/
USE test;
SELECT count(*) as employees_with_manager FROM emp WHERE mgr is NOT null;