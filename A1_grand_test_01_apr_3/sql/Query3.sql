/* Write a SQL query to find the customer who ordered the most keyboards, 
using pattern matching and aggregate functions.

Expected Output Columns:
------------------------
+---------------+---------------+
| Name          | KeyboardCount |
+---------------+---------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
use customer_orders;
SELECT 
    c.Name,
    SUM(oi.Quantity) AS KeyboardCount
FROM 
    customer_orders.Customers c
JOIN 
    customer_orders.Orders o ON c.CustomerID = o.CustomerID
JOIN 
    customer_orders.OrderItems oi ON o.OrderID = oi.OrderID
JOIN 
    customer_orders.Products p ON oi.ProductID = p.ProductID
WHERE 
    p.Name in ('keyboard')  
GROUP BY 
    c.CustomerID, c.Name
ORDER BY 
    KeyboardCount DESC
LIMIT 1;
