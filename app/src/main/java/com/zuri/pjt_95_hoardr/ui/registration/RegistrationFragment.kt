package com.zuri.pjt_95_hoardr.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.zuri.pjt_95_hoardr.R
import com.zuri.pjt_95_hoardr.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginLink.setOnClickListener {
            loginUser(it)
        }

        binding.nextBtn.setOnClickListener{
            findNavController().navigate(R.id.action_registrationFragment_to_secondRegistrationFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun loginUser(view: View) {
        view.findNavController().navigate(R.id.loginFragment)
    }


    companion object {}
}