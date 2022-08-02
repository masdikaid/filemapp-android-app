package com.mdidproject.movupapp.ui.boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.mdidproject.movupapp.R
import com.mdidproject.movupapp.abstraction.base.BaseFragment
import com.mdidproject.movupapp.databinding.FragmentBoardingOneBinding

class BoardingOneFragment : BaseFragment<FragmentBoardingOneBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_one

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObOneNext.setOnClickListener {
            val action = BoardingOneFragmentDirections.actionBoardingOneFragmentToBoardingTwoFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}