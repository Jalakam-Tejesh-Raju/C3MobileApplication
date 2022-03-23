package com.example.medicineapplication.ui.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medicineapplication.R

class CustomAdapter(private val img:Array<Int>, private val text: Array<String>,
                    private val desc: Array<String>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {


    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindValue(image: Int, txt: String, desc: String){
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(image)
            itemView.findViewById<TextView>(R.id.text1).text = txt
            itemView.findViewById<TextView>(R.id.text2).text = desc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(v)
    }

    override fun getItemCount(): Int {
        return img.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValue(img[position],text[position],desc[position])
    }
}