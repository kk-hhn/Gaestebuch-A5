package com.example.aufgabe3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.aufgabe3.model.BookingEntry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SharedViewModel: ViewModel() {
    private val _bookingsEntries = MutableStateFlow<List<BookingEntry>>(emptyList())
    val bookingsEntries: StateFlow<List<BookingEntry>> = _bookingsEntries

    fun addBookingEntry(entry: BookingEntry){
        val currentList=_bookingsEntries.value
        val updatedList= currentList+entry
        _bookingsEntries.value= updatedList
    }

    fun deleteBookingEntry(entry:BookingEntry){
        val currentList=_bookingsEntries.value
        val updatedList= currentList-entry
        _bookingsEntries.value= updatedList

    }
}