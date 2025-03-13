/* Write a SQL query to show employees ordered by salary descending and then by 
employee name ascending.

+-------+--------+-----------+------+------------+---------+---------+--------+
| empno | ename  | job       | mgr  | hiredate   | sal     | comm    | deptno |
+-------+--------+-----------+------+------------+---------+---------+--------+
*/
USE test; 
select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp Order by sal desc , ename ;