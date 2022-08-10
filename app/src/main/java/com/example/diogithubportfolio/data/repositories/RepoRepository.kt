package com.example.diogithubportfolio.data.repositories

import com.example.diogithubportfolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}