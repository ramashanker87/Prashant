### Build Application
    mvn clean install
### Start Data Base using docker

    docker-compose up

### Verify the running container

    docker ps


#### Windows
    docker exec -it mysql bash


### Connect to mysql database

    mysql -u user -p
### Show database

    show databases;

### Select the database

    use student;

### Display the table

    show tables;

### Execute mysql query

    select * from student;

### Exit from docker container
    exit

### Start the spring application

    mvn spring-boot:run



### Access Data Base user interface

    http://localhost:8081/


### Down the docker container

    docker-compose down


### Json data 
    {
         "name":"student1",
         "schoolName": "school1",
         "age":17,
         "gender": "M",
    }