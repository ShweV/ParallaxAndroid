package com.mindorks.framework.parallaxandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mindorks.framework.parallaxandroid.adapter.BooksRecyclerAdapter
import com.mindorks.framework.parallaxandroid.util.Util

class BooksFragment : Fragment() {

    fun newInstance(): BooksFragment {
        return BooksFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View? = inflater.inflate(R.layout.books_fragment, container, false)
        val rvBooks : RecyclerView = view!!.findViewById(R.id.rvBooksList)
        rvBooks?.layoutManager = LinearLayoutManager(activity);
        val recyclerAdapter = BooksRecyclerAdapter(Util().getBooks())
        rvBooks?.adapter = recyclerAdapter
        return view
    }
}