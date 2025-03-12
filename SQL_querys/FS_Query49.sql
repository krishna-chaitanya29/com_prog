/* Write a SQL query to sum the commissions for employees with salaries below 1500.

Expected Output Columns:
------------------------
+-----------------------+
| total_comm_low_salary |
+-----------------------+

*/
USE test;

SELECT sum(comm) as total_comm_low_salary FROM emp WHERE sal < 1500;