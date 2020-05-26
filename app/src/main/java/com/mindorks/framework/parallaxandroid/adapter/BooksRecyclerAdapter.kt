package com.mindorks.framework.parallaxandroid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.framework.parallaxandroid.R
import com.mindorks.framework.parallaxandroid.adapter.BooksRecyclerAdapter.*
import com.mindorks.framework.parallaxandroid.model.Books

class BooksRecyclerAdapter(private val mBooks: List<Books>) : RecyclerView.Adapter<ViewHolder>() {

    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.text_title)
        val authorTextView: TextView = itemView.findViewById(R.id.text_author)
        val subTitleTextView: TextView = itemView.findViewById(R.id.text_subtitle)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ViewHolder {
        val context: Context = parent.context
        val inflater = LayoutInflater.from(context)
        val booksView: View = inflater.inflate(R.layout.item_books, parent, false)
        return ViewHolder(booksView)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int) {
        val titleTextView: TextView = viewHolder.titleTextView
        titleTextView.text = mBooks[position].title
        val authorTextView: TextView = viewHolder.authorTextView
        authorTextView.text = mBooks[position].author
        val subTitleTextView: TextView = viewHolder.subTitleTextView
        subTitleTextView.text = mBooks[position].subtitle
    }

    override fun getItemCount(): Int {
        return mBooks.size
    }
}
