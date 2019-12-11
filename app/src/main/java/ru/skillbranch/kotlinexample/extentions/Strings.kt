package ru.skillbranch.kotlinexample.extentions

fun String.isValidPhone() = this.trimPhone().matches(Regex("^\\+\\d{11}"))

fun String.trimPhone() = this.replace("[^+\\d]".toRegex(), replacement = "")