package com.najitest.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.najitest.coderswag.R
import com.najitest.coderswag.model.Category

class CategoryAdatper(val context: Context, val categories: List<Category>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView : View
        var viewHolder: ViewHolder = ViewHolder()

        if (convertView == null ) {

            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            viewHolder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            viewHolder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = viewHolder

        } else {

            viewHolder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category =  categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        viewHolder.categoryImage?.setImageResource(resourceId)

        viewHolder.categoryName?.text  = category.title
        return  categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private  class  ViewHolder {
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }
}