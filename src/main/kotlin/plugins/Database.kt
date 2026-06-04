package com.khaledamin.plugins

import com.khaledamin.models.Onboardings
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.server.application.Application
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import java.sql.DriverManager

fun Application.configureDatabase() {

    val config = HikariConfig().apply {
        jdbcUrl    = "jdbc:mysql://localhost:3306/prototypingkits?useSSL=false&serverTimezone=UTC"
        driverClassName = "com.mysql.cj.jdbc.Driver"
        username   = "root"
        password   = "5aL3d&hesham2023&&"
        maximumPoolSize = 10
    }

    Database.connect(HikariDataSource(config))

    transaction {
        SchemaUtils.create(Onboardings)
    }
}