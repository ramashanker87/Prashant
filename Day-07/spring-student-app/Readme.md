### maven build
```Bash
mvn clean install
```
###run program
```Bash
mvn spring-boot:run
```
###Application Rest endpoint

### To check health
Get http://localhost:8080/actuator/health


### Read student
Get http://localhost:8080/student/read?name=Student1

### post student
Post http://localhost:8080/student/add
{
"name":"Student3",
"age": 25,
"roll":"Role3"
}

### put student
Put http://localhost:8080/student/put?name=Student1&age=30

###Delete student
Delete http://localhost:8080/student/delete?name=Student1