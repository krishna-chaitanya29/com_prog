/* Write a SQL query to list products ordered in both 'Shipped' and 'Processing' statuses 
but not 'Cancelled'.

Expected Output Columns:
------------------------
+------------+
| Name       |
+------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;

select p.Name from Products p 
join OrderItems oi on oi.productID = p.productID
join Orders o on o.orderID = oi.orderID
group by p.Name
having count(distinct status) = 2 and status <> cancelled;