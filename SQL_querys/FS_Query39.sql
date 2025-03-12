/* Write a SQL query to calculate the total salary and total commission for all employees.

Expected Output Columns:
------------------------
+--------------+------------------+
| Total Salary | Total Commission |
+--------------+------------------+

*/
USE test;

SELECT sum(sal) as 'Total Salary' , sum(comm) as 'Total Commission' FROM emp;