package com.compose.composetestapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.compose.composetestapp.data.SharedRepository
import com.compose.composetestapp.domain.food.ApiFoodModel
import com.compose.composetestapp.domain.main.MainScreenDataModel
import kotlinx.coroutines.launch

class RstRepoViewModel() : ViewModel() {

    private val repository = SharedRepository()

    private val _allLiveData = MutableLiveData<MainScreenDataModel?>()
    val allLiveData: LiveData<MainScreenDataModel?> = _allLiveData

    private val _foodLiveData = MutableLiveData<ApiFoodModel?>()
    val foodLiveData: LiveData<ApiFoodModel?> = _foodLiveData

    fun refreshMainScreenData() {
        viewModelScope.launch {
            val response = repository.getMainScreenData()
            _allLiveData.postValue(response)
        }
    }

    fun refreshFoodData() {
        viewModelScope.launch {
            val response = repository.getFoodData()
            _foodLiveData.postValue(response)
        }
    }
}

