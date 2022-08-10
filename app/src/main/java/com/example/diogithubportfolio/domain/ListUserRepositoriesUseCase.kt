package com.example.diogithubportfolio.domain

import com.example.diogithubportfolio.core.UseCase
import com.example.diogithubportfolio.data.model.Repo
import com.example.diogithubportfolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}