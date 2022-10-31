

package com.sklagat46.pagingprac.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sklagat46.pagingprac.R
import com.sklagat46.pagingprac.ui.RedditAdapter
import kotlinx.android.synthetic.main.activity_main.*

class RedditPostsActivity : AppCompatActivity() {
    private val redditAdapter = RedditAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()

        //TODO: Replace with fetchPosts()
    }

    private fun setupViews() {
        rvPosts.adapter = redditAdapter
    }
}