package io.github.superbderrick.summerplayer.local

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.superbderrick.summerplayer.R
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*


class ContentAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun onBindViewHolder(p0: ViewHolder, position: Int) {
        p0?.tvAnimalType?.text = items.get(position)
    }

    // Gets the number of contents in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val tvAnimalType = view.content_title


}