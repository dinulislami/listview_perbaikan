package com.example.listview225

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class adapterlist (var mCtx: Context, var resource:Int, var items:List<model>)
    : ArrayAdapter<model>(mCtx,resource,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource , null)
        val imageView: ImageView = view.findViewById(R.id.gambar)
        val textView: TextView = view.findViewById(R.id.judul)
        val textView1: TextView = view.findViewById(R.id.description)

        var mItems:model = items [position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItems.logo))

        textView.text = mItems.nama
        textView1.text = mItems.deskripsi




        return view
    }

}