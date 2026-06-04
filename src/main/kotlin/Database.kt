package com.khaledamin

import com.khaledamin.data.models.Onboardings
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.server.application.Application
import io.ktor.server.util.url
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.DatabaseConfig
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabase() {
    val config = HikariConfig().apply {
        /*
        jdbcUrl    = <your sql url>
        driverClassName = <driver name>
        username   = <mysql username>
        password   = <password for mysql>
        maximumPoolSize = <maximum no of connections per pool>
        */
    }

    Database.connect(HikariDataSource(config))

    transaction {
        SchemaUtils.create(Onboardings)
    }
}