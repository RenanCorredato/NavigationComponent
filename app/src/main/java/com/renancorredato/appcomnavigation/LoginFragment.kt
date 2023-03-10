package com.renancorredato.appcomnavigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.renancorredato.appcomnavigation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btnRegister.setOnClickListener {
//            register()
//        }

        binding.btnLogin.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_panelFragment))


//            Log.i("RENAN", findNavController().currentDestination?.label.toString())
//            Log.i("RENAN", findNavController().currentDestination?.displayName.toString())
//            Log.i("RENAN", findNavController().currentDestination?.id.toString())



//        binding.btnBack.setOnClickListener {
////            goBack()
//        }
    }


//    private fun register() {
//       findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
//    }

//    private fun goBack() {
//        findNavController().popBackStack()
//    }

}
