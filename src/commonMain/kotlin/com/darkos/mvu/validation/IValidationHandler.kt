package com.darkos.mvu.validation

import com.darkos.mvu.EffectHandler
import com.darkos.mvu.models.flow.FlowEffect
import com.darkos.mvu.models.flow.FlowMessage

interface IValidationHandler : EffectHandler {
    override suspend fun call(effect: FlowEffect): kotlinx.coroutines.flow.Flow<FlowMessage> {
        throw IllegalStateException("this handler does not support calling as Flow")
    }
}