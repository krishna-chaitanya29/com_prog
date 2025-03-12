/* Write a SQL query to find the average commission for salesmen, excluding NULLs.

Expected Output Columns:
------------------------
+-------------------+
| avg_salesman_comm |
+-------------------+

*/
USE test;

SELECT avg(comm) as avg_salesman_comm FROM emp WHERE job = 'SALESMEN' and comm is NOT null ;