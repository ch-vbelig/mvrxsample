package com.example.mvrxsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.airbnb.mvrx.withState
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val viewModel = HelloWorldViewModel(HelloWorldState())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        withState(viewModel){state -> textView.text = state.excitedTitle}

        button.setOnClickListener{
            title = withState(viewModel){state -> state.title}
            print(title)
            viewModel.changeState(button.text.toString())
            //viewModel.changeState()
            button.text = title
        }




    }

}