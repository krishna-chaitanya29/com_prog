/* Perform Sum of salaries and commissions by dept 30 

Expected Output Columns:
+----------+------------+
| TotalPay | TotalBonus |
+----------+------------+

*/
USE test;
SELECT sum(sal) as TotalPay , sum(comm) as TotalBonus FROM emp WHERE deptno = 30 group by deptno;