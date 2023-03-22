package com.example.lovcontriler

interface CounterView {
    fun updateText(count: String )
    fun showToast()
    fun setColor(color: Int)
}