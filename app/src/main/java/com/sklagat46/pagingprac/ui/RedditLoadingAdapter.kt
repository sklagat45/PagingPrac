

package com.sklagat46.pagingprac.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sklagat46.pagingprac.R

class RedditLoadingAdapter(private val retry: () -> Unit) :
    LoadStateAdapter<RedditLoadingAdapter.LoadingStateViewHolder>() {

    class LoadingStateViewHolder(itemView: View, retry: () -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        //TODO: not implemented
    }

    override fun onBindViewHolder(holder: LoadingStateViewHolder, loadState: LoadState) {
        TODO("not implemented")
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): LoadingStateViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_loading_state, parent, false)
        return LoadingStateViewHolder(view, retry)
    }
}