package com.khaledamin.data.models

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

object Onboardings: IntIdTable("onboardings") {
    val onboardingId = integer(name = "id")
    val title =  varchar("title",255)
    val description = varchar("description",255)
}

class Onboarding(id: EntityID<Int>) : IntEntity(id) {
    companion object: IntEntityClass<Onboarding>(Onboardings)
        val onboardingId: Int by Onboardings.onboardingId
        val title: String by Onboardings.title
        val description: String by Onboardings.description
}