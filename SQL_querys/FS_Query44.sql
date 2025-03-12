/* Write a SQL query to find the maximum hire date (latest hire) in the emp table.

Expected Output Columns:
------------------------
+-------------+
| latest_hire |
+-------------+

*/
USE test;

SELECT MAX(hiredate) AS latest_hire
FROM emp;