package com.wjw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <h1>
 * O Spring Cloud Discovery é um dos princípios fundamentais de uma arquitetura baseada em microsserviço.
 * Tentar configurar manualmente cada cliente ou alguma forma de convenção pode ser difícil de fazer e pode ser frágil.
 * Eureka é o Netflix Service Discovery Server e Client. O servidor pode ser configurado e implementado para estar
 * altamente disponível, com cada servidor replicando o estado sobre os serviços registrados para os outros. 
 * </h1>
 * 
 * @author wwenceslau:wwenceslau@gmail.com
 * 
 * @since 29/04/2019
 * @version 00.01
 *
 */

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}
