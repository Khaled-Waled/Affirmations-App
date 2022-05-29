package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = DataSource().loadAffirmation()                            //get the dataset
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)       //Reference the view
        recyclerView.adapter = ItemAdapter(this, dataSet)                //set the view's adapter
        recyclerView.setHasFixedSize(true)                                      //the size is static (not necessary)


    }
}