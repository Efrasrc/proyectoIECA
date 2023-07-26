package com.example.appfinal  //.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class menu : AppCompatActivity() {
    private lateinit var adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: List<DataModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        recyclerView = findViewById(R.id.item_cards)
        recyclerView.layoutManager = LinearLayoutManager(this)

        dataList = createDataList()
        adapter = MyAdapter(this, dataList)
        recyclerView.adapter = adapter
    }

    private fun createDataList() : List<DataModel> {
        val list = ArrayList<DataModel>()
        list.add(DataModel("CURSO", R.drawable.course))
        list.add(DataModel("TAREA", R.drawable.homework))
        list.add(DataModel("EXAMEN", R.drawable.exam))
        list.add(DataModel("REGLAMENTO", R.drawable.rules))

        return list
    }
}



