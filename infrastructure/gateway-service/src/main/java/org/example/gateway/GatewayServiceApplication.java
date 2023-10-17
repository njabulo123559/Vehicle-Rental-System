package org.example.gateway;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(GatewayServiceApplication.class, args);

    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("users-service", r -> r.path("/users/**")
                        .uri("lb://users-service")) // Route to the Users service
                .route("reservations-service", r -> r.path("/reservations/**")
                        .uri("lb://reservations-service")) // Route to the Reservations service
                .route("cars-service", r -> r.path("/cars/**")
                        .uri("lb://cars-service")) // Route to the Cars service
                .build();
    }

}
