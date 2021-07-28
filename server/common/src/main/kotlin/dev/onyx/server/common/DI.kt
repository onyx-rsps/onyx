package dev.onyx.server.common

import org.koin.core.Koin
import org.koin.core.component.KoinScopeComponent
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.mp.KoinPlatformTools

typealias Scoped = KoinScopeComponent

fun getKoin(): Koin = KoinPlatformTools.defaultContext().get()

inline fun <reified T : Any> Any.get(
    qualifier: Qualifier? = null,
    noinline parameters: ParametersDefinition? = null
): T {
    return if(this is Scoped) {
        scope.get(qualifier, parameters)
    } else {
        getKoin().get(qualifier, parameters)
    }
}

inline fun <reified T : Any> Any.inject(
    qualifier: Qualifier? = null,
    mode: LazyThreadSafetyMode = KoinPlatformTools.defaultLazyMode(),
    noinline parameters: ParametersDefinition? = null
): Lazy<T> {
    return lazy(mode) { get(qualifier, parameters) }
}