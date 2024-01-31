package com.pritam.microservices.v2.apigatewayserver;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/currency-exchange/**").uri("lb://currency-exchange-service/"))
				.route(p->p.path("/currency-converter/**").uri("lb://currency-calculation-service"))
				.build();
	}
}
