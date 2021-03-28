package com.puc.sca.bi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * https://docs.github.com/pt/github/setting-up-and-managing-your-github-profile/why-are-my-contributions-not-showing-up-on-my-profile
 * 
 * No meu caso o erro era no email, estava breno500as@github.com e o correto é breno500as@gmail.com
 * descobri aqui: https://github.com/breno500as/kafka-library-consumer/commit/3f6bffc4bf589d1879370b4c9205ea11981925a7.patch
 * pegando o status e corrigi com:  git config --global user.email breno500as@gmail.com
 * 
 * 
 * 
 * @author breno. 
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ScaBiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ScaBiApplication.class, args);
	}

}
