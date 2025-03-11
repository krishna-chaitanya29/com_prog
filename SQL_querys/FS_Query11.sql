/* Get employees who are not managers and have a salary below 2000.

Expected Output Columns:
+------+----------+------------+
|ename |    job   |   sal      |
+------+----------+------------+

*/
USE test;
SELECT e.ename,e.job,e.sal FROM emp as e WHERE job != 'MANAGER' and e.sal<2000;  