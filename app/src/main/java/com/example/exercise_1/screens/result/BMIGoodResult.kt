package com.example.exercise_1.screens.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.exercise_1.R
import com.example.exercise_1.databinding.FragmentBmiGoodResultsBinding


class BMIGoodResult : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var binding: FragmentBmiGoodResultsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bmi_good_results, container,  false)

        val args = BMIGoodResultArgs.fromBundle(arguments!!)
        val result = args.bmiResult

        return binding.root
        }
    }
