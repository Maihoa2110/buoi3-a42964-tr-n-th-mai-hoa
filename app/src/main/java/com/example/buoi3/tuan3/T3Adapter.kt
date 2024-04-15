package com.example.buoi3.tuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.buoi3.R
class T3Adapter (val ls: ArrayList<T3Contact>, val context: Context): BaseAdapter(){
    // tong so item
    override fun getCount(): Int {
        return ls.size
    }
    // tra ve 1 item
    override fun getItem(position: Int): Any {
        return ls[position]
    }
    // lay ve  id cua 1 item
    override fun getItemId(position: Int): Long {

        return position.toLong()
    }
    // tra ve view
    override fun getView(position: Int, cvv: View?, parent: ViewGroup?): View {
        // B1: Tao view
        var cvv = cvv
        val vax: ViewAX
        if(cvv == null) // chua co view -> tao view moi
        {
            vax = ViewAX() // tao view moi
            // anh xa layout itemview
            cvv = LayoutInflater.from(context).inflate(R.layout.t3_item_view,null)
            // anh xa tung phan
            vax.img_hinh=cvv!!.findViewById(R.id.t3ItemHinh)
            vax.tv_ten = cvv!!.findViewById(R.id.T3ItemTen)
            vax.tv_tuoi = cvv!!.findViewById(R.id.T3ItemTuoi)
            // tao template de lan sau su dung
            cvv.tag = vax

        }
        else{
            vax = cvv.tag as ViewAX
        }
        // gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].hinh)
        vax.tv_ten!!.text=ls[position].ten
        vax.tv_tuoi!!.text=ls[position].tuoi
        return cvv
    }
    // Dinh nghia class cua itemview
    internal inner class ViewAX{
        var img_hinh: ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }

}