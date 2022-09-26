package com.compose.composetestapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.composetestapp.data.SharedRepository
import com.compose.composetestapp.domain.ApiButton
import com.compose.composetestapp.domain.MainScreenDataModel
import kotlinx.coroutines.launch

class RstRepoViewModel() : ViewModel() {

    private val repository = SharedRepository()

    private val _allLiveData = MutableLiveData<MainScreenDataModel?>()
    val allLiveData: LiveData<MainScreenDataModel?> = _allLiveData

    fun refreshData() {
        viewModelScope.launch {
            val response = repository.getAllData()
            _allLiveData.postValue(response)
        }
    }
}

