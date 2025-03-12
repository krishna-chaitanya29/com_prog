/* Write a SQL query to determine the minimum commission value, excluding NULLs.

Expected Output Columns:
------------------------
+----------------+
| min_commission |
+----------------+

*/
USE test;

SELECT min(comm) as min_commission FROM emp WHERE comm IS NOT null;