package com.example.mvrxsample

class HelloWorldViewModel(initialState: HelloWorldState): MvRxViewModel<HelloWorldState>(initialState){
    fun changeState(msg: String){
        setState { copy(title = "$msg!")
        }
        println("sdf")
    }
}