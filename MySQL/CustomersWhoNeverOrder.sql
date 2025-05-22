-- select name as customers from customers
-- where id not in (select customerId from orders);

-- # Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers AS c
LEFT JOIN Orders AS o ON c.id = o.customerId
WHERE o.id IS NULL;