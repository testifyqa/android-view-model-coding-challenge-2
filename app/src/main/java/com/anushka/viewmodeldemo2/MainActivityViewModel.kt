package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var total = 0

    fun getTotal(): Int = total

    fun setTotal(input: Int) {
        total += input
    }
}