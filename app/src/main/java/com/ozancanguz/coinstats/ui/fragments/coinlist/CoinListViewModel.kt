package com.ozancanguz.coinstats.ui.fragments.coinlist

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.coinstats.data.apimodel.coin.Coins
import com.ozancanguz.coinstats.data.repository.Repository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {


    val coinList=MutableLiveData<Coins>()

    fun getAllCoinList(){

        viewModelScope.launch {
            val response=repository.remote.getCoinList()
            if(response.isSuccessful){
                coinList.postValue(response.body())
            }else{
                Log.d("viewmodel","no data")
            }
        }
    }

}