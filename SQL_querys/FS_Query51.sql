/*  Write a SQL query to find the average salary and number of employees per department, 
ordered by average salary in descending order.

Expected Output Columns:
------------------------
+--------+-------------+----------+
| deptno | AVG(sal)    | COUNT(*) |
+--------+-------------+----------+

*/
USE test; 

SELECT deptno,AVG(sal),COUNT(*) FROM emp GROUP BY deptno Order by AVG(sal) desc;