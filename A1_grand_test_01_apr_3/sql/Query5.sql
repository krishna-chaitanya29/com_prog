/* Write a SQL query to find the top 3 most expensive products never ordered.

Expected Output Columns:
------------------------
+------------+--------+
| Name       | Price  |
+------------+--------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;
select p.name as name,p.price as Price from Products
p left join OrderItems on
p.productid=OrderItems.productid where
OrderItems.productid is null
order by p.price limit 3;