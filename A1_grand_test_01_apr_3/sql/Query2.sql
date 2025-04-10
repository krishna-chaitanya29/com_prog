/* Write a SQL query to find the customer with the highest average order cost, 
excluding cancelled orders.

Expected Output Columns:
------------------------
+--------------+-------------+
| Name         | AvgCost     |
+--------------+-------------+

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
    AVG(o.TotalCost) AS AvgCost
FROM 
    customer_orders.Customers c
JOIN 
    customer_orders.Orders o ON c.CustomerID = o.CustomerID
WHERE 
    o.Status != 'Cancelled'
GROUP BY 
    c.CustomerID, c.Name
ORDER BY 
    AvgCost DESC
LIMIT 1;
