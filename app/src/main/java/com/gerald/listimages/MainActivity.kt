package com.gerald.listimages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1 = Product("TextBook", 1000.0, 23, R.drawable.ione)
        val p2 = Product("Globe", 5000.0, 50, R.drawable.itwo)
        val p3 = Product("SchoolBus", 500000.0, 10, R.drawable.ithree)
        val p4 = Product("Pencils", 200.0, 88, R.drawable.ifour)
        val p5 = Product("ExerciseBook", 900.0, 20, R.drawable.ifive)
        val p6 = Product("File", 300.0, 88, R.drawable.isix)
        val p7 = Product("Chemicals", 3500.0, 55, R.drawable.iseven)
        val p8 = Product("Microscope", 22000.0, 80, R.drawable.ieight)
        val p9 = Product("LogBook", 1000.0, 40, R.drawable.inine)
        val p10 = Product("MarkerPen", 90.0, 120, R.drawable.iten)

        val product = arrayListOf<Product>(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10)
        val productsRecyclerView: RecyclerView = findViewById(R.id.recyclerViewProducts)
        productsRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter =CustomAdapter(product)

        productsRecyclerView.adapter = adapter
    }
}