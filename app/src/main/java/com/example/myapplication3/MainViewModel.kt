package com.example.myapplication3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.File
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    private val _files: MutableLiveData<List<File>> = MutableLiveData(emptyList())
    val files: LiveData<List<File>> = _files

}