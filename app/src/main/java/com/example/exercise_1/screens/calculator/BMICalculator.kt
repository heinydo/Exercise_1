package com.example.exercise_1.screens.calculator

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.exercise_1.R
import android.widget.Toast
import com.example.exercise_1.databinding.FragmentBmiCalculatorBinding
import java.lang.Exception


class BMICalculator : Fragment() {

    private lateinit var viewModel : BMICalculatorViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiCalculatorBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi__calculator, container,  false)




        viewModel = ViewModelProviders.of(this).get(BMICalculatorViewModel::class.java)

        binding.calculateButton.setOnClickListener {view : View ->
            try{


            val weightInput : String = binding.weightInput.text.toString()
            val heihgtInput : String = binding.heightInput.text.toString()
            var bmi =  viewModel.onCalculate(weightInput.toDouble(), heihgtInput.toDouble())

                when (bmi) {
                    in 0..18 -> {
                        view.findNavController().navigate(BMICalculatorDirections.actionBMICalculatorToBMILessBadResult(bmi))
                    }
                    in 19..24 -> {
                        view.findNavController().navigate(BMICalculatorDirections.actionBMICalculatorToBMIGoodResult(bmi))
                    }
                    else -> {
                        view.findNavController().navigate(BMICalculatorDirections.actionBMICalculatorToBMIBadResult(bmi))
                    }
                }
            }
            catch(e : Exception)
            {
                Log.i("Fehler", "Fehler")
                Toast.makeText(activity, "Fehler! Überprüfen sie bitte Ihre eingaben", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}
