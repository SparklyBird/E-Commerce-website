# E-website

## Technology stack
- Java
- HTML/CSS/JS
- Maven
- SpringBoot framework (with Thymeleaf)
- SQLite database
- Junit 5
- Spring security

<br>

Before Running application you need to uncomment logic in /configuration/database/SchemaInitializer.java 
to run schema for data insertion in database and then comment them out for second time (because of insertion conflicts)

    executeSchemaScript(userDataSource, "schema-user.sql");
    executeSchemaScript(baseDataSource, "schema-base-product-and-categories.sql");
    executeSchemaScript(baseDataSource, "schema-base-attributes.sql");

Then you should be able to access it under http://localhost:8080/ and see homepage

For login you can use admin "admin@gmail.com" and regular "user@gmail.com" user, both have the password "nimda"

Note:
If you want to be able to pay with stripe and see your results, add your stripe public and secret key in: ./resources/application.properties

stripe.key.public=...

stripe.key.secret=...
