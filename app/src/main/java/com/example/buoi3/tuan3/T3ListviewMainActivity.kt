package com.example.buoi3.tuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buoi3.R
import android.widget.ListView


class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t3_listview_main)
        var lv=findViewById<ListView>(R.id.t3Listview) // anh xa
        //them du lieu vao listview
        ls.add(T3Contact ( "ABC",  "2", R.drawable.camera))
        ls.add(T3Contact ( "Tran Thi G",  "19", R.drawable.trust))
        ls.add(T3Contact ( "Vu Thi C",  "25", R.drawable.heart))
        ls.add(T3Contact ("Nguyen Van B",  "23", R.drawable.heart48))
        ls.add(T3Contact ( "Nguyen Van R",  "60", R.drawable.heart50))
        ls.add(T3Contact ( "Nguyen Van T", "80", R.drawable.phonecall))
        ls.add(T3Contact ( "Tran Van A",  "30", R.drawable.camera))
        ls.add(T3Contact ( "Hoang Van A",  "20", R.drawable.camera64))
        //tao adapter
        adapter=T3Adapter (ls,  this)
        //gan gu lieu len listview
        lv!!.adapter=adapter


    }
}