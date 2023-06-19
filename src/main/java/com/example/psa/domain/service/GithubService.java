package com.example.psa.domain.service;

import java.io.IOException;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

import com.example.psa.domain.dto.RepositoryInformation;

@Service
public class GithubService {

	private GithubConnector githubConnector;

	public GithubService(GithubConnector githubConnector) {
		this.githubConnector = githubConnector;
	}

	public RepositoryInformation getInformation(String owner, String repositoryName) throws IOException {
		// 특정 모듈에 대한 의존성이 높아 서비스(단위) 테스트가 어려워지게 됩니다.
		// GitHub github = GitHub.connect();
		GitHub github = githubConnector.connect();
		GHRepository repository = github.getRepository(owner + "/" + repositoryName);

		return new RepositoryInformation(repository.getFullName(), repository.getStargazersCount(), repository.getForksCount());
	}

}
