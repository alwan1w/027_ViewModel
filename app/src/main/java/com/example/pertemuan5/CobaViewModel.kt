package com.example.pertemuan5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan5.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String,alm:String ,jk:String,eml:String){
        namaUsr=nm;
        noTlp=tlp;
        alamat=alm;
        email=eml;
        jenisKl=jk;
    }
    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStatus(pilihsta:String){
        _uiState.update { currentState -> currentState.copy(sta = pilihsta) }
    }
}