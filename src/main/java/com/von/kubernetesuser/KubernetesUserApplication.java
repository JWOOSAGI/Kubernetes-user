package com.von.kubernetesuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KubernetesUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(KubernetesUserApplication.class, args);
	}
}
