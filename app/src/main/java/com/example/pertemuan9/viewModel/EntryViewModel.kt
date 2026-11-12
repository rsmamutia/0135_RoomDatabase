package com.example.pertemuan9.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa ): Boolean {
        return with(uiState) {
            nama.isNotBlank( ) && alamat.isNotBlank( ) && telpon.isNotBlank( )
        }
    }

    fun updateuiState(detailSiswa: DetailSiswa) {
        uiStateSiswa=
            UIStateSiswa(detailSiswa = detailSiswa, isEntryValid = validasiInput(detailSiswa))
    }

    suspend fun saveSiswa() {
        if (validasiInput()) {
            repositorisiswa.insertSiswa(uiStateSiswa.detailSiswa.toSiswa())
        }
    }
}