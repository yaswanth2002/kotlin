package com.example.cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(courseModelArrayList: ArrayList<CourseModel>) :
    RecyclerView.Adapter<CourseAdapter.Viewholder>() {



    private val courseModelArrayList: ArrayList<CourseModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseAdapter.Viewholder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: CourseAdapter.Viewholder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: CourseModel = courseModelArrayList[position]
        holder.courseNameTV.setText(model.getCourse_name())
        holder.courseRatingTV.setText("" + model.getCourse_rating())
        holder.courseIV.setImageResource(model.getCourse_image())
        holder.itemname.setText("" + model.getItem_name())


    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return courseModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseIV: ImageView
        val courseNameTV: TextView
        val courseRatingTV: TextView
        val itemname: TextView
        init {
            courseIV = itemView.findViewById(R.id.idIVCourseImage)
            courseNameTV = itemView.findViewById(R.id.idTVCourseName)
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating)
            itemname =itemView.findViewById(R.id.idItemPrice)
        }
    }



    // Constructor
    init {
        this.courseModelArrayList = courseModelArrayList
    }
}

