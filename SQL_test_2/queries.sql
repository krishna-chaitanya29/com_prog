/* Query to List Products with No Orders

Expected Output Columns:
------------------------
+-----------+--------------+
| ProductID | Name         |
+-----------+--------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;
SELECT p.ProductID as ProductID , p.Name as Name 
FROM Products p
LEFT JOIN OrderItems oi ON p.ProductID = oi.ProductID
WHERE oi.OrderItemID IS NULL or oi.OrderItemID = 0 ;



/* Query to Get Total Sales for Each Product

Expected Output Columns:
------------------------
+--------------+------------+
| Name         | TotalSales |
+--------------+------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;
SELECT 
    p.Name as Name, SUM(oi.Quantity * oi.UnitPrice), 0) AS TotalSales
FROM Products p
LEFT JOIN OrderItems oi ON p.ProductID = oi.ProductID
GROUP BY p.Name;


/* Query Using a Correlated Subquery to Get the Latest Order for Each Customer

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
USE customer_orders;
SELECT OrderID, CustomerID, OrderDate, TotalCost
FROM Orders o1
WHERE OrderDate = (
    SELECT MAX(o2.OrderDate)
    FROM Orders o2
    WHERE o2.CustomerID = o1.CustomerID
);



/* Query to Get Monthly Sales Summary

Expected Output Columns:
------------------------
+---------+--------------+
| Month   | MonthlySales |
+---------+--------------+
| yyyy-mm |      xxxx.xx |
+---------+--------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;
SELECT 
    DATE_FORMAT(OrderDate, '%Y-%m') AS Month,
    SUM(TotalCost) AS MonthlySales
FROM Orders
GROUP BY DATE_FORMAT(OrderDate, '%Y-%m')
ORDER BY Month;



/* Query to Find the Most Frequently Ordered Product

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
USE customer_orders;
SELECT 
    p.Name, 
    SUM(oi.Quantity) AS TotalQuantity
FROM OrderItems AS oi
JOIN Products AS p 
    ON oi.ProductID = p.ProductID
GROUP BY p.Name
ORDER BY TotalQuantity DESC
LIMIT 1;



/* Query to Display customer names in reverse order along with their email domains

Expected Output Columns:
------------------------
+----------------+-------------+
| ReversedName   | EmailDomain |
+----------------+-------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;
SELECT 
    REVERSE(Name) AS ReversedName,
    SUBSTRING(Email, LOCATE('@', Email) + 1) AS EmailDomain
FROM Customers ;



/* Calculate the number of days since each customer's last order and display the name in title case

Expected Output Columns:
------------------------
+----------------+--------------------+
| TitleCaseName  | DaysSinceLastOrder |
+----------------+--------------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;
SELECT 
    CONCAT(UPPER(LEFT(c.Name, 1)), LOWER(SUBSTRING(c.Name, 2))) AS TitleCaseName,
    DATEDIFF(CURDATE(), MAX(o.OrderDate)) AS DaysSinceLastOrder
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID, c.Name;




/* Write a SQL query to find the top 3 most expensive products never ordered, using `NOT IN` and `ORDER BY`.

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
USE customer_orders;
SELECT
    Name,
    Price
FROM Products
WHERE ProductID NOT IN ( SELECT DISTINCT ProductID FROM OrderItems)
ORDER BY Price DESC
LIMIT 3;



/* Write a SQL query to calculate the total revenue from orders placed in the last 3 days of the dataset, using `DATE_SUB`.

Expected Output Columns:
------------------------
+---------------+
| RecentRevenue |
+---------------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;


SELECT 
    SUM(TotalCost) AS RecentRevenue
FROM Orders
WHERE OrderDate > DATE_SUB(CURDATE(), INTERVAL 3 DAY);



/* Write a SQL query to find products ordered in every status type, using `NOT EXISTS` and `DISTINCT`.

Expected Output Columns:
------------------------
+-------+
| Name  |
+-------+

Note: 
-----
Database name: customer_orders

Tables in customer_orders:  Customers                                                                       
                            OrderItems                                                                      
                            Orders                                                                          
                            Products

*/
USE customer_orders;

SELECT p.Name
FROM Products p
WHERE NOT EXISTS (
    SELECT s.Status
    FROM (SELECT DISTINCT Status FROM Orders) s
    WHERE NOT EXISTS (
        SELECT 1
        FROM Orders o
        JOIN OrderItems oi ON o.OrderID = oi.OrderID
        WHERE o.Status = s.Status 
          AND oi.ProductID = p.ProductID
    )
);
