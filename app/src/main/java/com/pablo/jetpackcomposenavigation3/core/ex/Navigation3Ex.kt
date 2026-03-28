package com.pablo.jetpackcomposenavigation3.core.ex

import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey

//Funciones de extensión de navegación para facilitar su uso
fun NavBackStack<NavKey>.navigateTo(screen: NavKey) {
    add(screen)
}

fun NavBackStack<NavKey>.back() {
    if (isEmpty()) return
    removeLastOrNull()
}

fun NavBackStack<NavKey>.backTo(targetScreen: NavKey) {
    if (isEmpty()) return
    if(targetScreen !in this) return

    while(isNotEmpty() && last() != targetScreen){
        removeLastOrNull()
    }

}