package com.mdidproject.filemapp.ui.auth

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_sign_in

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignIn.setOnClickListener {
            val action = SignInFragmentDirections.actionSignInFragmentToHomeActivity()
            it.findNavController().navigate(action)
        }

        binding.tvActionRegister.setOnClickListener {
            val action = SignInFragmentDirections.actionSignInFragmentToSignUpFragment()
            it.findNavController().navigate(action)
        }

        super.onViewCreated(view, savedInstanceState)
    }
}