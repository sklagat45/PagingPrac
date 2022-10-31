
package com.sklagat46.pagingprac.repositories

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.raywenderlich.android.redditclone.database.RedditDatabase
import com.raywenderlich.android.redditclone.models.RedditPost
import com.sklagat46.pagingprac.networking.RedditService

@OptIn(ExperimentalPagingApi::class)
class RedditRemoteMediator(
    private val redditService: RedditService,
    private val redditDatabase: RedditDatabase
) : RemoteMediator<Int, RedditPost>() {
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, RedditPost>
    ): MediatorResult {
        TODO("not implemented")
    }
}