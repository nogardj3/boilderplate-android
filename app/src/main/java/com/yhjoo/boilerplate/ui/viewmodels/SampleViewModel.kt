package com.yhjoo.android_boilerplate.ui.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhjoo.boilerplate.data.SampleData
import com.yhjoo.boilerplate.data.repository.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val repository: SampleRepository
) : ViewModel() {
    private var _eventResult = MutableSharedFlow<Events>()
    val eventResult = _eventResult.asSharedFlow()

    private var _sampleResult = MutableLiveData<SampleData>()
    val sampleResult: LiveData<SampleData>
        get() = _sampleResult

    init {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }

    private suspend fun checkServerAlive() {
    }

    enum class Events {
        ALIVE_WITH_LOGIN, ALIVE, DEAD
    }
}