-- Write your MySQL query statement below
select p.lastName,
        p.firstName,
        a.city,
        a.state
from Person p left join Address a on p.personId = a.personId;
-- Explanation:
-- 1. FROM Person p
-- This is selecting from the Person table.

-- The alias p is used to refer to the Person table more concisely in the query.

-- 2. LEFT JOIN Address a ON p.personId = a.personId
-- This performs a LEFT JOIN between the Person table (p) and the Address table (a), using the personId as the key to match rows.

-- LEFT JOIN means:

-- All rows from the Person table will be returned.

-- If a matching personId is found in the Address table, the corresponding city and state will be included.

-- If no match is found, city and state will be NULL.

-- 3. SELECT p.lastName, p.firstName, a.city, a.state
-- This tells the query to return:

-- The person's last name and first name (from the Person table).

-- The city and state (from the Address table, if available).

-- Summary:
-- This query gives you a list of all people from the Person table, along with their city and state
-- if they have an address in the Address table.
-- If a person doesn't have a corresponding address, their city and state fields will be NULL.

-- Write a solution to report the first name, last name, city, and state of each person in the Person table.
-- If the address of a personId is not present in the Address table, report null instead.

-- Return the result table in any order.

-- The result format is in the following example.

-- Example 1:

-- Input: 
-- Person table:
-- +----------+----------+-----------+
-- | personId | lastName | firstName |
-- +----------+----------+-----------+
-- | 1        | Wang     | Allen     |
-- | 2        | Alice    | Bob       |
-- +----------+----------+-----------+
-- Address table:
-- +-----------+----------+---------------+------------+
-- | addressId | personId | city          | state      |
-- +-----------+----------+---------------+------------+
-- | 1         | 2        | New York City | New York   |
-- | 2         | 3        | Leetcode      | California |
-- +-----------+----------+---------------+------------+
-- Output: 
-- +-----------+----------+---------------+----------+
-- | firstName | lastName | city          | state    |
-- +-----------+----------+---------------+----------+
-- | Allen     | Wang     | Null          | Null     |
-- | Bob       | Alice    | New York City | New York |
-- +-----------+----------+---------------+----------+
-- Explanation: 
-- There is no address in the address table for the personId = 1 so we return null in their city and state.
-- addressId = 1 contains information about the address of personId = 2.