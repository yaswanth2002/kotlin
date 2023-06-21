package com.example.cardview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseRV = findViewById<RecyclerView>(R.id.idRVCourse)

        // Here, we have created new array list and added data to it
        val courseModelArrayList: ArrayList<CourseModel> = ArrayList<CourseModel>()
        courseModelArrayList.add(CourseModel("CATLA FISH ", 5, R.drawable.catla,"RS.100"))
        courseModelArrayList.add(CourseModel(" PINK FISH ", 5, R.drawable.fish,"RS.100"))
        courseModelArrayList.add(CourseModel("ROHU FISH", 5, R.drawable.rohu,"Rs.100"))
        courseModelArrayList.add(CourseModel("SALMON FISH", 5, R.drawable.salmon,"Rs.100"))
        courseModelArrayList.add(CourseModel("PAMPHLET FISH", 5, R.drawable.pamphlet,"Rs.100"))
        courseModelArrayList.add(CourseModel("NETHILI FISH", 5, R.drawable.nethili,"Rs.100"))
        courseModelArrayList.add(CourseModel("BLACK FISH", 5, R.drawable.black,"Rs.100"))

        // we are initializing our adapter class and passing our arraylist to it.
        val courseAdapter = CourseAdapter(courseModelArrayList)

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.layoutManager = linearLayoutManager
        courseRV.adapter = courseAdapter


            val buttonClick = findViewById<Button>(R.id.button)
            buttonClick.setOnClickListener {
                    val intent = Intent(this, DetailedActivity::class.java)
                    startActivity(intent)
                }
    }

}