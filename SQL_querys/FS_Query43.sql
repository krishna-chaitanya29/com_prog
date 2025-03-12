/* Write a SQL query to find the total commission paid to employees hired after 1995.

Expected Output Columns:
------------------------
+----------------------+
| total_comm_post_1995 |
+----------------------+

*/
USE test;

SELECT sum(comm) as total_comm_post_1995 FROM emp WHERE YEAR(hiredate) > 1995;