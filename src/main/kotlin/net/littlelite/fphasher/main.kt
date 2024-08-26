/*
 *  Pure functional password hasher
 *
 *  MIT License (MIT)
 *  Copyright (c) 2024 Alessio Saltarin
 *
 */

package net.littlelite.fphasher

import java.security.MessageDigest
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

/**
 * The password hasher works like this:
 * - The password in clear is passed as input parameter
 * - The password is hashed using a SHA-256 algorithm
 * - The hashed password is returned as a Base64 string
 */
fun main()
{
    val password = "ALESSIO SALTARIN"
    val hashedPassword = hasher(password)
    println("Password: $password")
    println("Hashed Password: $hashedPassword")
}

fun hasher(password: String): String
{
    return password
        .addSalt()
        .toByteArray()
        .hashPassword()
        .toBase64()
}

fun String.addSalt(): String = "SALT$this"

fun ByteArray.hashPassword(): ByteArray = MessageDigest.getInstance("SHA-256").digest(this)

@OptIn(ExperimentalEncodingApi::class)
fun ByteArray.toBase64(): String = Base64.encode(this)













