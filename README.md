#InventoryManagement
#Steps to Install and use
##Pre-Requisite
###Java SE 21.x
###Mysql database installed on laptop
###Apache Tomcat 10.1.x - Download tar and extract to a folder
###Eclipse IDE for Enterprise Java Version 2023-09
##Setup Eclipse project
###Open Eclipse
###Choose File -> Import
###Choose Git -> Repositories From GitHub
###Next screen Search for "akshaghna/InventoryMnaagement"
###setup local directory and finish. This will checkout the project into local eclipse workspace
###Add new Apache Tomact Server to Eclipse by selecting Tomcat folder
##Setup Database
###Login to Mysql database
###Create database with name "OIM"
###Create username with name and password "admin/admin1234"
###Grant all permissions to admin user on OIM database
#### Ex- CREATE DATABASE OIM;
####CREATE USER 'admin' IDENTIFIED BY 'admin123';
####GRANT ALL PRIVILEGES ON OIM.* TO 'admin'@'localhost' WITH GRANT OPTION;
###Run database.sql from InventoryManagement/src/webapp folder
##Run application
###Right click on Tomcat server added in Eclipse
###Add InventoryManagement project
###Start Tomcat Server
###Access "http://localhost:8080/InventoryManagement" page in a browser