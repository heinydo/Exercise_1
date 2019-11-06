package com.example.exercise_1.screens.calculator

import android.util.Log
import androidx.lifecycle.ViewModel
import java.math.RoundingMode
import java.text.DecimalFormat

class BMICalculatorViewModel : ViewModel(){

    private var bmiNumber = 0
    private var bmiResult = ""

    init {
        Log.i("ViewModels","BMI erstellt")
    }

    fun onCalculate(weight: Double, height: Double) : Int
    {
        bmiNumber = calculateBMI(weight, height).second
        return bmiNumber
    }

    private fun calculateBMI(weight: Double, height: Double): Pair<String, Int> {
        val df = DecimalFormat("#.#")
        df.roundingMode = RoundingMode.HALF_UP

        val bmi = weight / (height * height)
        return Pair("BMI\n" + df.format(bmi), bmi.toInt())
    }

    private fun getCategoryIdentifier(): String {
        when (bmiNumber) {
            in 0..18 -> {
                bmiResult = "Zu wenig Gewicht"
            }
            in 19..24 -> {
                bmiResult = "Perfektes Gewicht"
            }
            in 25..29 -> {
                bmiResult = "Etwas zu viel Gewicht"
            }
            in 30..39 -> {
                bmiResult = "Zu viel Gewicht"
            }
            else -> {
                bmiResult = "Viel zu viel Gewicht"
            }
        }
        return bmiResult
    }
}