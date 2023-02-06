package com.renancorredato.appcomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.renancorredato.appcomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.btnLogin.setOnClickListener {
//            findNavController(binding.fragmentContainerView.id).navigate(R.id.action_fragmentHome_to_navigation_graph_auth2)
//        }
//        binding.btnPanel.setOnClickListener {
//            findNavController(binding.fragmentContainerView.id).navigate(R.id.action_fragmentHome_to_panelFragment)
//        }
    }
}