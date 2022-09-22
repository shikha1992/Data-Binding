package com.example.bindingdemo1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bindingdemo1.model.Student

class DataConnectingViewModel : ViewModel() {

    fun setStudentData(): Student {
        return Student(1, "Test", "English")
    }
}