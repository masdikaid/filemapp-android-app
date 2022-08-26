package com.mdidproject.filemapp.ui.auth

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.findNavController
import com.google.android.material.datepicker.MaterialDatePicker
import com.mdidproject.filemapp.R
import com.mdidproject.filemapp.abstraction.base.BaseFragment
import com.mdidproject.filemapp.databinding.FragmentSignUpBinding
import com.mdidproject.filemapp.ui.boarding.BoardingTwoFragmentDirections
import java.text.SimpleDateFormat
import java.util.*

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

        binding.etBirthday.setOnClickListener { et ->
            val datePicker =
                MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Select Date")
                    .setTheme(R.style.FilemApp_Component_DatePicker)
                    .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                    .build()
            datePicker.show(parentFragmentManager, "Signup Date")

            datePicker.addOnPositiveButtonClickListener {
                val date = Date(it)
                val format = SimpleDateFormat("dd/MM/yyyy")
                (binding.etBirthday as TextView).text = format.format(date)
            }
        }

        binding.btnSignUp.setOnClickListener {
            val action = SignUpFragmentDirections.actionSignUpFragmentToWellcomeProfileFragment()
            it.findNavController().navigate(action)
        }



        super.onViewCreated(view, savedInstanceState)
    }
}