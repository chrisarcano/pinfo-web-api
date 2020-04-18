DROP SCHEMA IF EXISTS pinfo;
CREATE SCHEMA pinfo;
USE pinfo;

DROP TABLE IF EXISTS pinfo.expense; 
CREATE TABLE pinfo.expense (
  expense_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  expense_name VARCHAR(50) NOT NULL DEFAULT 'New Expense',
  billing_start_day TINYINT UNSIGNED,
  billing_end_day TINYINT UNSIGNED,
  billing_due_day TINYINT UNSIGNED COMMENT 'Range 1 to 31',
  frequency ENUM('m', 'q', 'bia', 'a') DEFAULT 'm' COMMENT 'm=monthly, q=quarterly, bia=biannually, a=annually',
  estimated_amount DECIMAL(8,2),
  notes VARCHAR(300),
  date_created DATE,
  date_updated DATE,
  date_effective DATE,
  date_expiration DATE
);

DROP TABLE IF EXISTS pinfo.group;
CREATE TABLE pinfo.group (
  group_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  group_name VARCHAR(30) NOT NULL DEFAULT 'New Group',
  notes VARCHAR(300),
  date_created DATE,
  date_updated DATE
);

DROP TABLE IF EXISTS pinfo.group_expense;
CREATE TABLE pinfo.group_expense (
  group_id TINYINT UNSIGNED NOT NULL,
  expense_id TINYINT UNSIGNED NOT NULL
);

DROP TABLE IF EXISTS pinfo.expense_history;
CREATE TABLE pinfo.expense_history (
  expense_id TINYINT UNSIGNED NOT NULL,
  due_date DATE,
  amount_due DECIMAL(8,2),
  paid ENUM('true','false') DEFAULT 'false',
  amount_paid DECIMAL(8,2),
  date_paid DATE,
  notes VARCHAR(300),
  date_created DATE,
  date_updated DATE
);

