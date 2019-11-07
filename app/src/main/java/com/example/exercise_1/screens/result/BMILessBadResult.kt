package com.example.exercise_1.screens.result


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiLessBadResultBinding

class BMILessBadResult : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiLessBadResultBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi_less_bad_result, container, false)

        val args = BMIGoodResultArgs.fromBundle(arguments!!)
        val result = args.bmiResult.toString()

        binding.lessBadResultBmiAusgabe.text = result

        binding.goBackFromLessBadButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_BMILessBadResult_to_BMI_Calculator)
        )
        // Inflate the layout for this fragment
        return binding.root
    }
}