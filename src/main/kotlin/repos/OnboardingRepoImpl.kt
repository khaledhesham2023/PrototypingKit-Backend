package com.khaledamin.repos

import com.khaledamin.dtos.OnboardingDTO
import com.khaledamin.dtos.toDto
import com.khaledamin.models.Onboarding
import org.jetbrains.exposed.sql.transactions.transaction

class OnboardingRepoImpl: OnboardingRepo {
    override fun getOnBoardingData(): List<OnboardingDTO> = transaction {
        Onboarding.all().map { item -> item.toDto() }
    }
}