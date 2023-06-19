package com.example.psa.domain.service;

import java.io.IOException;

import org.kohsuke.github.GitHub;

public interface GithubConnector {

	GitHub connect() throws IOException;

}
