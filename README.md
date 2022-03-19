# Currency Microservices

 # Images
 
 1. currency-exchange-service docker build image
    - docker.io/namant744/currency-exchange-service:0.0.1-SNAPSHOT
 
 2. currency-conversion-service
    - docker.io/namant744/currency-conversion-service:0.0.1-SNAPSHOT
 
 3. naming-server
    - docker.io/namant744/naming-server:0.0.1-SNAPSHOT

 4. api-gateway
    - docker.io/namant744/api-gateway:0.0.1-SNAPSHOT
 
 
 # URLS
 
#### Currency Exchange Service
    http://localhost:8000/currency-exchange/from/USD/to/INR
    
#### Currency Conversion Service
    http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
    http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10
    
#### Eureka
    http://localhost:8761/
    
#### Zipkin
    http://localhost:9411/
    
#### API GATEWAY
    http://localhost:8765/currency-exchange/from/USD/to/INR
    http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
    http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
    http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10

# Commands

```
  docker run -p 9411:9411 openzipkin/zipkin:2.23
  docker push docker.io/namant744/currency-exchange-service:0.0.1-SNAPSHOT
  docker-compose --version
  docker-compose up
  docker push namant744/naming-server:0.0.1-SNAPSHOT
  docker push namant744/currency-conversion-service:0.0.1-SNAPSHOT
  docker push namant744/api-gateway:0.0.1-SNAPSHOT
  watch -n 0.1 curl http://localhost:8000/sample-api
 ```
