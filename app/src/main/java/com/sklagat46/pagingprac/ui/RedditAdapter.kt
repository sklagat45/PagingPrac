

package com.sklagat46.pagingprac.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.android.redditclone.models.RedditPost
import com.sklagat46.pagingprac.utils.DiffUtilCallBack
import com.sklagat46.pagingprac.R
import kotlinx.android.synthetic.main.adapter_row.view.*

class RedditAdapter :
    PagingDataAdapter<RedditPost, RedditAdapter.RedditViewHolder>(DiffUtilCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RedditViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_row, parent, false)
        return RedditViewHolder(view)
    }

    override fun onBindViewHolder(holder: RedditViewHolder, position: Int) {
        TODO("not implemented")
    }

    class RedditViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val scoreText: TextView = itemView.score
        private val commentsText: TextView = itemView.comments
        private val titleText: TextView = itemView.title

        fun bindPost(redditPost: RedditPost) {
            with(redditPost) {
                scoreText.text = score.toString()
                commentsText.text = commentCount.toString()
                titleText.text = title
            }
        }
    }
}