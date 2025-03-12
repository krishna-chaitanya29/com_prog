/* Find employees whose salary is higher than the salary of ‘SCOTT’.

Expected Output Columns:
------------------------
+-------+---------+
| ename | sal     |
+-------+---------+

*/
USE test;

SELECT ename , sal FROM emp WHERE sal > (SELECT max(sal) FROM emp WHERE ename ='SCOTT' );