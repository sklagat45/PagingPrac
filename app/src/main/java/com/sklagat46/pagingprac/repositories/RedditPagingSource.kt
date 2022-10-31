
package com.sklagat46.pagingprac.repositories

import androidx.paging.PagingSource
import com.raywenderlich.android.redditclone.models.RedditPost
import com.sklagat46.pagingprac.networking.RedditService

abstract class RedditPagingSource(private val redditService: RedditService) :
    PagingSource<String, RedditPost>() {

    override suspend fun load(params: LoadParams<String>): LoadResult<String, RedditPost> {
        TODO("not implemented")
    }
}