package com.mdidproject.filemapp.ui.boarding

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentBoardingOneBinding

class BoardingOneFragment : BaseFragment<FragmentBoardingOneBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_one

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObOneNext.setOnClickListener {
            val action = BoardingOneFragmentDirections.actionBoardingOneFragmentToBoardingTwoFragment()
            it.findNavController().navigate(action)
        }

        binding.btnObOneSkip.setOnClickListener {
            val action = BoardingOneFragmentDirections.actionBoardingOneFragmentToSignInFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}