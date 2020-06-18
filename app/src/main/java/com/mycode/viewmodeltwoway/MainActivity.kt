package com.mycode.viewmodeltwoway

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mycode.viewmodeltwoway.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //don't forgot to add
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel
    }}
