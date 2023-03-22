package com.example.lovcontriler

import android.graphics.Color

class Presenter {
    var model = Injector.fillModel()
    lateinit var view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())

    }

    fun decrementCount() {
        model.decrement()
        view.updateText(model.count.toString())

    }

    fun attachView(view: CounterView) {
        this.view = view
    }
    fun account_verification(){
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.setColor(R.color.red)
        }else if (model.count < 15){
            view.setColor(R.color.black)

        }
    }
}