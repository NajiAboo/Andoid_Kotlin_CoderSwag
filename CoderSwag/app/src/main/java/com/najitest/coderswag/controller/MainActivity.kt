package com.najitest.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.najitest.coderswag.Adapter.CategoryAdatper
import com.najitest.coderswag.Adapter.CategoryRecycleAdatper
import com.najitest.coderswag.R
import com.najitest.coderswag.model.Category
import com.najitest.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdatper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter =  CategoryRecycleAdatper(this,
                                DataService.categories)

        CategoryListView.adapter = adapter

        //Performance
        val layoutManager = LinearLayoutManager(this)
        CategoryListView.layoutManager = layoutManager
        CategoryListView.setHasFixedSize(true)

    }
}
