package com.mdidproject.filemapp.ui.boarding

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentBoardingFourBinding

class BoardingFourFragment : BaseFragment<FragmentBoardingFourBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_four

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObFourNext.setOnClickListener {
            val action = BoardingFourFragmentDirections.actionBoardingFourFragmentToSignInFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}