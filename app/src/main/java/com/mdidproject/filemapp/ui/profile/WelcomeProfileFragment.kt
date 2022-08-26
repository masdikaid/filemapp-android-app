package com.mdidproject.filemapp.ui.profile

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentWellcomeProfileBinding
import com.mdidproject.filemapp.ui.boarding.BoardingTwoFragmentDirections

class WelcomeProfileFragment : BaseFragment<FragmentWellcomeProfileBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_wellcome_profile

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnAvatarToHome.setOnClickListener {
            val action = WelcomeProfileFragmentDirections.actionWellcomeProfileFragmentToHomeActivity()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}