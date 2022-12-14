# Requirements

Given this basic spring-boot project structure, please implement a
REST service that implements an endpoint to solve the palindrome
problem described below.

We are looking for you to:

* complete, refine, and polish the solution you started building with us
* use tests to show the effectiveness of your solution
* add any applicable documentation
* note any assumptions that you make

Please craft a solution that:

* you would consider to be representative of your level of professionalism
* you would be comfortable handing off to someone else to maintain


## Palindrome problem

Given a string n representing an integer, return the closest integer
(not including itself), which is a palindrome. If there is a tie,
return the smaller one.

example:

Input: n = "123"

Output: "121"


## Additional Requirements

* Implement an API contract (e.g. swagger/OpenAPI)
* Validation of requests adhering to contract
* Update to run on java 17
* Enable linting/formatting
* Note and/or implement any improvements to the code and project
  structure that you believe would make this service "enterprise
  ready"

### Optional 

The sample algorithm used may not be the most efficient implementation
of the solution. Implement a more performant solution and discuss or
show how you can prove your implementation is faster than the original.


# Getting Started


### Run maven project:

```shell
mvn spring-boot:run
```

### build jar file 

```shell
mvn clean package spring-boot:repackage
java -jar target/palindrome-1.0.0.jar
```

Solution:-
----------

## Access the api with below details:
-----------------------------------------
Endpoint:- /api/palindrom/closest-palindrom?{number}

Example:- http://localhost:8080/api/palindrom/closest-palindrom?number=121

## Swagger:
------------
Swagger url:- http://localhost:8080/swagger-ui/index.html#/ 

http://localhost:8080/swagger-ui/index.html#/find-closest-palindrome-controller

Api docs :- http://localhost:8080/v2/api-docs 


