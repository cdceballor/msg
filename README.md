# msg
# Necesita crear una base de datos en MySql con las siguientes características:

* Crear base de datos una vez esté adentro de MySql:

```sh
create database users;
```

* Crear tabla users:

```sh
create table users (id INT AUTO_INCREMENT, name VARCHAR(40), contractType VARCHAR(40), roleId INT, roleName VARCHAR(40), roleDescription VARCHAR(40), 
                    hourlySalary INT, monthlySalary INT, PRIVARY KEY (id));

```

* Insertar valores iniciales:

```sh
insert into users values (1,"Andrea","HourlySalaryEmployee",1,"Administrator",null,10000.0,50000.0)
insert into users values (2,"Alex","MonthlySalaryEmployee",2,"Contractor",null,10000.0,50000.0)
```
