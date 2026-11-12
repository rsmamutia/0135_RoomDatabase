package com.example.pertemuan9.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pertemuan9.R
import com.example.pertemuan9.uicontroller.DestinasiNavigasi

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}