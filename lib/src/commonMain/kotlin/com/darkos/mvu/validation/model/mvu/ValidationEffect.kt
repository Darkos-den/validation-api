package com.darkos.mvu.validation.model.mvu

import com.darkos.mvu.validation.model.Field
import com.darkos.mvu.model.Effect

sealed class ValidationEffect : Effect() {
    class Validate(val fields: List<Field>) : ValidationEffect()
}