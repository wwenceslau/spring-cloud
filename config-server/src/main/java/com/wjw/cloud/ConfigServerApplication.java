package com.wjw.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <h1>
 * O Spring Cloud Config fornece suporte do lado do servidor e do lado do cliente para
 * configuração externalizada em um sistema distribuído.
 * Com o Config Server, você tem um local central para gerenciar propriedades externas
 * para aplicativos em todos os ambientes. 
 * </h1>
 * 
 * @author wwenceslau:wwenceslau@gmail.com
 * 
 * @since 27/04/2019
 * @version 00.01
 *
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
