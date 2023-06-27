package com.example.booksapp

import androidx.lifecycle.ViewModel
import kotlin.properties.Delegates

class BookListViewModel : ViewModel() {
    var repoPosition by Delegates.notNull<Int>()
}