package com.example.psa.domain.dto;

public record RepositoryInformation(
		String name,
		int starCount,
		int forkCount
) {
}
