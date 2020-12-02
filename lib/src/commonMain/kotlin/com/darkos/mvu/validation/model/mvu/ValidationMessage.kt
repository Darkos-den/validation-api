package com.darkos.mvu.validation.model.mvu

import com.darkos.mvu.validation.model.Field
import com.darkos.mvu.model.Message

sealed class ValidationMessage : Message() {
    class Error(val wrongFields: List<Long>) : ValidationMessage()
    object Success : ValidationMessage()
    object Triggered: ValidationMessage()
}