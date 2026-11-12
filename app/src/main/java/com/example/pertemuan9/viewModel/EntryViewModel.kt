package com.example.pertemuan9.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
}