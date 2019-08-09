# Vertica Training SGIJ (Subdirección General de Inspección de Juego)

# Install maven dependecies
Install Vertica jdbc driver:
mvn install:install-file -Dfile=vertica-jdbc-9.2.1-0.jar -DgroupId=com.vertica -DartifactId=vjdbc -Dversion=9.2.1 -Dpackaging=jar

Install Vertica Hibernate Dialect:
mvn install:install-file -Dfile=VerticaDialect.jar -DgroupId=com.vertica -DartifactId=vjdbc-dialect -Dversion=9.0.0 -Dpackaging=jar

# add maven Vertica dependencies in pom file
	<dependency>
		<groupId>com.vertica</groupId>
		<artifactId>vjdbc</artifactId>
		<version>9.2.1</version>
		<scope>runtime</scope>
	</dependency>
	<dependency>
		<groupId>com.vertica</groupId>
		<artifactId>vjdbc-dialect</artifactId>
		<version>9.0.0</version>
		<scope>runtime</scope>
	</dependency>
		
# Configure Spring Boot
Configure configure Spring Datasource and JPA configuration from Spring Boot application file (application-prod.yml):

spring:
  datasource:
    driverClassName: com.vertica.jdbc.Driver
    url: jdbc:vertica://192.168.1.40:5433/VMart?loginTimeout=35
    username: dbadmin
    password: password
  jpa:  
    generate-ddl: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.VerticaDialect
        temp:
          use_jdbc_metadata_defaults: false
    show-sql: true
