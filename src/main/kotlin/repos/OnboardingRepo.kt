package com.khaledamin.repos

import com.khaledamin.dtos.OnboardingDTO

interface OnboardingRepo {
    fun getOnBoardingData(): List<OnboardingDTO>
}