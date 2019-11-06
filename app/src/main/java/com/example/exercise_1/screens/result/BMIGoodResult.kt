package com.example.exercise_1.screens.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiGoodResultBinding


class BMIGoodResult : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiGoodResultBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi_good_result, container,  false)

        val args = BMIGoodResultArgs.fromBundle(arguments!!)
        val result = args.bmiResult.toString()

        binding.goodResultBmiAusgabe.text = result

        binding.goBackFromGoodButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_BMIGoodResult_to_BMI_Calculator)
        )

        return binding.root
        }
    }
