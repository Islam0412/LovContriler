package com.example.lovcontriler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lovcontriler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Injector.fillPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()

    }

    private fun initClickers() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.incrementCount()
                presenter.account_verification()
            }
            btnDecrement.setOnClickListener {
                presenter.decrementCount()
                presenter.account_verification()

            }
        }

    }

    override fun updateText(count: String) {
        binding.tvResult.text = count
    }

    override fun showToast() {

        Toast.makeText(this, "Поздровляю", Toast.LENGTH_SHORT).show()
    }

    override fun setColor(color: Int) {
        binding.tvResult.setTextColor(color)

    }


}