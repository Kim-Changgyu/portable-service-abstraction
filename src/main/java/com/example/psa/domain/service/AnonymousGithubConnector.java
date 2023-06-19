package com.example.psa.domain.service;

import java.io.IOException;

import org.kohsuke.github.GitHub;

public class AnonymousGithubConnector implements GithubConnector {

	@Override
	public GitHub connect() throws IOException {
		return GitHub.connectAnonymously();
	}

}
