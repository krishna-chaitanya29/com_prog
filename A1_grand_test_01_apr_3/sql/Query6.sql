/* Write a SQL Query Using a Correlated Subquery to Get the Latest Order for Each Customer

Expected Output Columns:
------------------------
+---------+------------+------------+-----------+
| OrderID | CustomerID | OrderDate  | TotalCost |
+---------+------------+------------+-----------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;
select o.orderid,o.customerid,o.orderdate,o.totalcost from 
Orders o where orderdate in
(select max(orderdate) from Orders where customerid=o.customerid);