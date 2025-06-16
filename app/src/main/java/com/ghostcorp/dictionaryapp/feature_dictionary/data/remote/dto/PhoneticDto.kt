package com.ghostcorp.dictionaryapp.feature_dictionary.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val sourceUrl: String,
    val text: String
)