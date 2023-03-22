package com.example.lovcontriler

class Injector {
    companion object{
        fun fillModel() = CounterModel()

        fun fillPresenter() = Presenter()
    }
}
