package com.sarkardeveloper.testerrika.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sarkardeveloper.testerrika.NewsRepository
import com.sarkardeveloper.testerrika.model.NewsModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val newsRepository: NewsRepository) :
    ViewModel() {
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.Main)

    private val _newsSource: MutableLiveData<NewsModel> = MutableLiveData()
    internal val newsSource: LiveData<NewsModel> get() = _newsSource

    fun loadNews() {
        scope.launch {
            newsRepository.getNews().let {
                _newsSource.postValue(it)
            }
        }
    }
}