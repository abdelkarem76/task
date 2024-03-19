package com.example.task

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    override fun onButtonClick() {
        val model = TaskModel()
        model.id = "22"
        model.name = "Abdelkarem esam"
        model.department = "IS"
        model.address = "cairo"
        model.country = "elshrouk_city"

        view.displayModel(model)
    }
}