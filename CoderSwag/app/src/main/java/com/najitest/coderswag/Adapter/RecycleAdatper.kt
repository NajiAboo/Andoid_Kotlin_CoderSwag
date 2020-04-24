package com.najitest.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.najitest.coderswag.R
import com.najitest.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*
import androidx.recyclerview.widget.RecyclerView.Adapter as Adapter1


class CategoryRecycleAdatper(val context: Context, val categories: List<Category>) : Adapter1 <CategoryRecycleAdatper.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =  LayoutInflater.from(context)
                    .inflate(R.layout.category_list_item, parent, false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }


    inner class  ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {

            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName?.text = category.title

        }

    }
}