package com.example.livedata_viewmodel_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedata_viewmodel_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // click listener on button is not required instead do data in xml file
        binding.myViewModel = viewModel
        // viewModel.counter.observe(this,  Observer { binding.tv1.text = it.toString()})
        binding.lifecycleOwner = this // Use this instead of the above line to get live data
    }
}