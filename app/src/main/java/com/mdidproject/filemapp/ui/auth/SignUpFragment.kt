package com.mdidproject.filemapp.ui.auth

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_sign_up

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ArrayAdapter.createFromResource(
            activity as Context,
            R.array.gender_option,
            android.R.layout.simple_spinner_dropdown_item
        ).also {
            binding.acGender.setDropDownBackgroundDrawable(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.dropdown_item,
                    null
                )
            )

            binding.acGender.setAdapter(it)
        }

//        binding.btnSignUp.setOnClickListener {
//            Toast.makeText(activity as Context, binding.spnrGender.selectedItem.toString(), Toast.LENGTH_SHORT).show()
//        }

        super.onViewCreated(view, savedInstanceState)
    }
}