# Spring Cloud and Ribbon, Feign
Providing client-side load balancing for a microservice application using Netflix Ribbon and Netflix Feign as well.

+ Apply Docker Compose
+ Apply Kubernetes

##### say-hello: it is a service app. It has api
http://localhost:8090/hi_getall

http://localhost:8090/greeting


##### user: Using Ribbon, connect to say-hello service
http://localhost:8888/hi

It will request to
http://localhost:8090/greeting of say-hello

##### user-client-service: Using Feign, connect to say-hello service
http://localhost:8899/getall-hi

It will request to http://localhost:8090/hi_getall of say-hello


### Reference
[Client Side Load Balancing with Ribbon and Spring Cloud](https://spring.io/guides/gs/client-side-load-balancing/)

[REST Client Using Netflix Feign](https://howtoprogram.xyz/2016/07/18/java-rest-client-using-netflix-feign/)

[GitHub] (https://github.com/ryanjbaxter/manual-feign-demo)