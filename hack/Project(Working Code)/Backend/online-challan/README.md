# Welcome to spring-boot-postgres Sample project

## Pre requisities
Java 8
Maven 3.1.x
Postgresql instance

## Postgres Instance Configuration
In order to use your instance please update the [ Database Configuration Section ] section in ```src/main/resources/dev/application.properties```
```
#
# [ Database Configuration Section ]
#
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.database.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/STMS
spring.datasource.username=postgres
spring.datasource.password=postgres
#
# [ Other Configuration Attributes ]
#
```

## Run Application Locally
```mvn spring-boot:run```

## Run Integration Tests
```mvn test -DhsqldbIntegrationTest=true```

## Load Sample Data
schema and data are initialized using ```schema-${platform}.sql``` and ```data-${platform}.sql```

## Invoke Application

### through browser
to make POST requests from your browser use tools like : https://chrome.google.com/webstore/detail/rest-console/cokgbflfommojglbmbpenpphppikmonn


to add a user make a POST like this example : ```http://localhost:9095/user```
to list all application users : ```http://localhost:9095/user```

### Add a user
```curl -X POST "http://localhost:9095/user"```
Following JSON content can be sent with request:
{
"username" : "Manmohan",
"password" : "manmohan",
"designation" : "Inspector",
"base_location" : "Bravos",
"challan_count_total" : "8050",
"challan_count_month" : "15",
"challan_count_year": "250"
}
running the above POST request will result to an 200 Ok HTTP response and JSON Content-Type of Application/json of the new created object.
the url must be URL_ENCODED before making the request (notice the %20 which encodes the white space character).

### To authenticate a user - POST
```curl "http://localhost:9095/authentication"```
 
{
"username" : "Manmohan",
"password" : "manmohan"
}

### To challan a user - POST 
```curl "http://localhost:9095/challan"```
{
"aadhar_no": "13245679",
"driving_license_no":"DL4578",
"reg_no":"RC4561",
"violatorDetails" : {
	"aadhar_no": "13245679",
	"username":"Prateek",
	"father_name":"Pratyush",
	"email_id": "minion@gmail.com" ,
	"address": "Cross Roads Kings Landing",
	"phone_no" : "7879879879",
	"local_address" :"Bell Tower Kings Landing",
	"date":"24-11-2017"
},
"date":"24-11-2017",
"place":"5th Avenue",
"longitute":"24",
"lattitude":"45",
"rules_violated":"Drunken driving"
}

