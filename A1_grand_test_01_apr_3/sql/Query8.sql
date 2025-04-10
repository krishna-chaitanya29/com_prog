/* Write a SQL Query to Find orders that were placed on weekends.

Expected Output Columns:
------------------------
+---------+------------+------------+
| OrderID | CustomerID | OrderDate  |
+---------+------------+------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;
select OrderId,customerid,orderdate from Orders where dayname(orderdate) in ('Saturday','Sunday');