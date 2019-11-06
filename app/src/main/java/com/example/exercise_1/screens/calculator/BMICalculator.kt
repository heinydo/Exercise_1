package com.example.exercise_1.screens.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiCalculatorBinding


class BMICalculator : Fragment() {

    private lateinit var viewModel : BMICalculatorViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiCalculatorBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi__calculator, container,  false)




        viewModel = ViewModelProviders.of(this).get(BMICalculatorViewModel::class.java)

        binding.calculateButton.setOnClickListener {view : View ->
            val weightInput : String = binding.weightInput.text.toString()
            val heihgtInput : String = binding.heightInput.text.toString()
            var bmi =  viewModel.onCalculate(weightInput.toDouble(), heihgtInput.toDouble())
            view.findNavController().navigate(BMICalculatorDirections.actionBMICalculatorToBMIGoodResult(bmi))

        }
        return binding.root
    }
}
