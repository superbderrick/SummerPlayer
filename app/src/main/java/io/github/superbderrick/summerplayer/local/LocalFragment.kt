package io.github.superbderrick.summerplayer.local

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.superbderrick.summerplayer.R
import kotlinx.android.synthetic.main.fragment_local.*


/**
 * A simple [Fragment] subclass.
 */
class LocalFragment : Fragment() {


    val animals: ArrayList<String> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_local, container, false)

        val contentsRecycleView = view.findViewById<RecyclerView>(R.id.content_recyclerView) as RecyclerView

        contentsRecycleView.layoutManager = GridLayoutManager(this.context , 2)
        contentsRecycleView.adapter = AnimalAdapter(animals , this.context!!)

        return view

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addAnimals()

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

    override fun onDestroy() {
        super.onDestroy()

        animals.clear()
    }

    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
    }

}