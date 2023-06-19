package com.example.psa.application.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.psa.domain.dto.RepositoryInformation;
import com.example.psa.domain.service.GithubService;

@RestController
@RequestMapping("/github")
public class GithubController {

	private final GithubService githubService;

	public GithubController(GithubService githubService) {
		this.githubService = githubService;
	}

	@GetMapping("/{owner}/{repositoryName}")
	public RepositoryInformation getInformation(@PathVariable String owner, @PathVariable String repositoryName) throws IOException {
		return githubService.getInformation(owner, repositoryName);
	}

}
