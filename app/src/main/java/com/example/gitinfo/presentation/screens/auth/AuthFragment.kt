package com.example.gitinfo.presentation.screens.auth


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import com.example.gitinfo.databinding.FragmentAuthBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AuthFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var binding: FragmentAuthBinding
    private val viewModel by viewModels<AuthViewModel> ()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater,container,false)
        viewModel.state.


        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    private fun handleAction(){

    }
}