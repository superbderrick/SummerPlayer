package io.github.superbderrick.summerplayer.local

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.superbderrick.summerplayer.R


/**
 * A simple [Fragment] subclass.
 */
class LocalFragment : Fragment() {

    val contents: ArrayList<String> = ArrayList()

    lateinit var contentMaker : ContentMaker

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_local, container, false)

        val contentsRecycleView = view.findViewById<RecyclerView>(R.id.content_recyclerView) as RecyclerView

        contentsRecycleView.layoutManager = GridLayoutManager(this.context , 2)
        contentsRecycleView.adapter = ContentAdapter(contents , this.context!!)

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        contentMaker = ContentMaker(this.context!!)

        addContents()
    }

    override fun onDestroy() {
        super.onDestroy()
        contents.clear()
    }

    fun addContents() {
        contents.add("dog")
        contents.add("cat")
        contents.add("owl")
        contents.add("cheetah")
    }

}