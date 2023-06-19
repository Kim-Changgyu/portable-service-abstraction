package com.example.psa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.psa.domain.service.AnonymousGithubConnector;
import com.example.psa.domain.service.GithubConnector;

@Configuration
public class GithubConfig {

	@Bean
	public GithubConnector githubConnector() {
		return new AnonymousGithubConnector();
	}

}
