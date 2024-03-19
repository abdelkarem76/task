package com.example.task

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), MainContract.View {
    //Abdelkarem esam(g2)


    private lateinit var presenter: MainContract.Presenter
    private lateinit var button: Button
    private lateinit var textName: TextView
    private lateinit var textId: TextView
    private lateinit var textAddress: TextView
    private lateinit var textCountry: TextView
    private lateinit var textDepartment: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textName = findViewById(R.id.text_name)
        textId = findViewById(R.id.text_id)
        textAddress = findViewById(R.id.text_address)
        textCountry = findViewById(R.id.text_country)
        textDepartment = findViewById(R.id.text_department)

        presenter = MainPresenter(this)

        button.setOnClickListener {
            presenter.onButtonClick()
        }
    }

    override fun displayModel(model: TaskModel) {
        textName.text = model.name
        textId.text = model.id
        textAddress.text = model.address
        textCountry.text = model.country
        textDepartment.text = model.department
    }
}
