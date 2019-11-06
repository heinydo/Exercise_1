package com.example.exercise_1.screens
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiCalculatorBinding


class BMICalculator : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiCalculatorBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi__calculator, container,  false)

        binding.calculateButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_BMI_Calculator_to_BMI_Result)
        )

        return binding.root
    }
}
