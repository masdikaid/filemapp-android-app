package com.mdidproject.filemapp.ui.boarding

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentBoardingTwoBinding

class BoardingTwoFragment : BaseFragment<FragmentBoardingTwoBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_two

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObTwoNext.setOnClickListener {
            val action = BoardingTwoFragmentDirections.actionBoardingTwoFragmentToBoardingThreeFragment()
            it.findNavController().navigate(action)
        }

        binding.btnObTwoSkip.setOnClickListener {
            val action = BoardingTwoFragmentDirections.actionBoardingTwoFragmentToSignInFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}