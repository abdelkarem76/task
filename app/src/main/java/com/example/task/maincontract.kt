package com.example.task

interface MainContract {
    interface View {
        fun displayModel(model: TaskModel)
    }

    interface Presenter {
        fun onButtonClick()
    }
}