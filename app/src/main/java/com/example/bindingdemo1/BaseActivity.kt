package com.example.bindingdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setBinding()
        setViewModel()
        onBindViews()
        setOnClickListener()
    }

    open fun setBinding() {

    }

    open fun setViewModel() {

    }

    open fun setOnClickListener() {

    }

    open fun onBindViews() {

    }

}