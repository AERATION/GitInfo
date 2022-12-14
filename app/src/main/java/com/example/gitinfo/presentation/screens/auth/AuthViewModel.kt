package com.example.gitinfo.presentation.screens.auth

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AppRepository,) : ViewModel() {
}