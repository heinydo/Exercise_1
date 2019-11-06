package com.example.exercise_1.screens.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiBadResultBinding


class BMIBadResult : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiBadResultBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi_bad_result, container, false)

        binding.goBackFromBadButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_BMIBadResult_to_BMI_Calculator)
        )
        // Inflate the layout for this fragment
        return binding.root
    }
}
