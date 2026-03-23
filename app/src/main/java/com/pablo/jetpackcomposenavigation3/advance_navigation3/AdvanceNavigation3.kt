package com.pablo.jetpackcomposenavigation3.advance_navigation3

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pablo.jetpackcomposenavigation3.advance_navigation3.Routes.Home
import com.pablo.jetpackcomposenavigation3.advance_navigation3.Routes.Detail
import com.pablo.jetpackcomposenavigation3.advance_navigation3.Routes.Error
import com.pablo.jetpackcomposenavigation3.core.ex.back
import com.pablo.jetpackcomposenavigation3.core.ex.navigateTo
import com.pablo.jetpackcomposenavigation3.screens.DetailScreen
import com.pablo.jetpackcomposenavigation3.screens.HomeScreen

@Composable
fun AdvanceNavigation3Wrapper() {
    val backStack = rememberNavBackStack(Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.back() },
        entryProvider = entryProvider {
            entry<Home> {
                HomeScreen { id ->
                    backStack.navigateTo(Detail(id))
                }
            }
            entry<Detail> { key ->
                DetailScreen(key.id) {
                    backStack.back()
                }
            }
            entry<Error> {
                Text("Error de navegación")
            }
        }
    )
}