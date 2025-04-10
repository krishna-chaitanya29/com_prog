/* Write a SQL Query to Find the Most Frequently Ordered Product.

Expected Output Columns:
------------------------
+-------+---------------+
| Name  | TotalQuantity |
+-------+---------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;
select p.name,sum(o.quantity) as TotalQuantity from Products p join OrderItems o on p.productid=o.productid
group by p.name order by
sum(o.quantity) desc limit 1;