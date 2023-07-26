package com.example.appfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ExamenActivity : AppCompatActivity() {
    private lateinit var adapter: SessionAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examen)

        recyclerView = findViewById(R.id.item_sessions)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = SessionAdapter(this, mutableListOf())
        recyclerView.adapter = adapter
        database = FirebaseDatabase.getInstance()

        val coursesRef = database.getReference("exams")
        coursesRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                adapter.clear()

                val coursesList = mutableListOf<SessionModel>()
                for (courseSnapshot in snapshot.children) {
                    val title = courseSnapshot.child("title").getValue(String::class.java)
                    val status = courseSnapshot.child("status").getValue(Boolean::class.java)
                    if (title != null && status != null) {
                        val course = SessionModel(title, status)
                        coursesList.add(course)
                    }
                }
                adapter.setData(coursesList)
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@ExamenActivity, "Error: ${error.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
