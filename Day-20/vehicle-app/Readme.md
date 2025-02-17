# Vehicle registartion app

## Post data - POST http://localhost:8080/register/vehicle

#### format

{
    "vehicle": {
        "vehicleNumber": "CG-2321",
        "vehicleType": "SUV",
        "fuelType": "Diesel"
    },
    "owner": {
        "name": "Prashant",
        "address": "Chhattisgarh",
        "age": 25
    }
}

## Read all data

GET http://localhost:8080/get/all-vehicles



## Delete Data with vehicle num

DELETE http://localhost:8080/deregister/vehicle
param - vehicleNumber : CG-2321



### By default, Vehicle is running in INFO logging mode and Owner is running in DEBUG logging mode 

#### To change Vehicle from INFO to DEBUG
curl -X POST "http://localhost:8080/actuator/loggers/com.prashant.app.module.Vehicle" -H "Content-Type: application/json" -d '{"configuredLevel": "DEBUG"}'

Or 
##### from powerShell

Invoke-WebRequest -Uri "http://localhost:8080/actuator/loggers/com.prashant.app.module.Vehicle" -Method Post -Headers @{"Content-Type"="application/json"} -Body '{ "configuredLevel": "DEBUG" }' -UseBasicParsing


#### To change Owner from DEBUG to INFO

curl.exe -X POST "http://localhost:8080/actuator/loggers/com.prashant.app.module.Owner" -H "Content-Type: application/json" -d '{"configuredLevel": "INFO"}'

Or
##### from powerShell

Invoke-WebRequest -Uri "http://localhost:8080/actuator/loggers/com.prashant.app.module.Owner" -Method Post -Headers @{"Content-Type"="application/json"} -Body '{ "configuredLevel": "INFO" }' -UseBasicParsing
