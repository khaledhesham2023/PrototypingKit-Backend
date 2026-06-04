package com.khaledamin.services

import com.khaledamin.dtos.OnboardingDTO
import com.khaledamin.enums.NetworkResponse
import com.khaledamin.repos.OnboardingRepoImpl

class OnboardingService {

    private val onboardingRepo = OnboardingRepoImpl()

    fun getAll(): NetworkResponse<List<OnboardingDTO>> = onboardingRepo.getOnBoardingData()
}