package com.renancorredato.appcomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.renancorredato.appcomnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.btnSignIn.setOnClickListener {
//            signIn()
//        }

        binding.btnSignIn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentHome_to_loginFragment)) // mesma coisa da função signIn

        binding.btnSignWithoutUser.setOnClickListener {
            signWithoutUser()
        }
    }

    private fun signWithoutUser() {
        findNavController().navigate(R.id.action_fragmentHome_to_panelFragment)
    }

//    private fun signIn() {
//        findNavController().navigate(R.id.action_fragmentHome_to_navigation_graph_auth2)
//    }
}