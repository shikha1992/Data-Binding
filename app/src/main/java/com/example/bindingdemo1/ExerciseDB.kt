package com.example.bindingdemo1

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bindingdemo1.databinding.ExerciseDbBinding

class ExerciseDB : BaseActivity() {

    lateinit var binding : ExerciseDbBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.exercise_db)
    }

    override fun setOnClickListener(){
        binding.controlButton.setOnClickListener {
            startOrStop()
        }
    }

    private fun startOrStop(){
        if(binding.progressBar.visibility == View.GONE){
            binding.controlButton.text = "STOP"
            binding.progressBar.visibility = View.VISIBLE
        }else{
            binding.controlButton.text = "START"
            binding.progressBar.visibility = View.GONE
        }
    }
}