# Application for Employee Information

## Build application with maven

```Bash
mvn clean install
```

## Run Application with maven

```Bash
mvn spring-boot:run
```

## Verify End Point Controller

### Verify application Health

```Bash
curl --location http://localhost:8080/actuator/health
```

### Create Employee

```Bash
curl.exe -X POST "http://localhost:8080/employee/create/employee" `
--header "Content-Type: application/json" `
--data "{`"id`": `"`2`", `"name`": `"emp2`", `"age`": 40 }"


```

### Read All Employee Data

```Bash
curl "http://localhost:8080/employee/get/all/employee"

```

### Update Employee Data

```Bash
curl.exe --request PUT "http://localhost:8080/employee/update/employee?id=1&age=22"

```

### Delete Employee Data

```Bash
curl.exe  --request DELETE "http://localhost:8080/employee/delete/employee?id=2"
```
