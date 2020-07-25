package com.example.mvrxsample

import com.airbnb.mvrx.MvRxState

data class HelloWorldState(val title: String="HelloWorld"): MvRxState {
    val excitedTitle = "$title!"
}