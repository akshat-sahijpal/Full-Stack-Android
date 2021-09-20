package com.akshatsahijpal.fullstackkotlin.ui

import android.service.autofill.UserData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akshatsahijpal.fullstackkotlin.remote.CustomApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private var api: CustomApi
): ViewModel(){
    private var _data : MutableLiveData <List<com.akshatsahijpal.fullstackkotlin.data.UserData>> = MutableLiveData()
    private var data : LiveData<List<com.akshatsahijpal.fullstackkotlin.data.UserData>> = _data
     fun fetchAllData () {
        viewModelScope.launch {
            _data.value = api.getAllUser()
        }
    }
    fun getAllData() = this.data
}