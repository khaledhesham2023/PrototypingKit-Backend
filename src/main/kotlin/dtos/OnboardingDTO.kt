package com.khaledamin.dtos

import com.khaledamin.models.Onboarding
import kotlinx.serialization.Serializable

@Serializable
data class OnboardingDTO(
    val id: Int,
    val title: String,
    val description: String
)

fun Onboarding.toDto() = OnboardingDTO(
    id = this.id.value,
    title = this.title,
    description = this.description
)