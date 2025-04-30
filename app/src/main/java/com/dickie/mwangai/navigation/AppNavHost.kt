package com.dickie.mwangai.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dickie.mwangai.ui.theme.screens.Dashboard.Dashboard_Screen
import com.dickie.mwangai.ui.theme.screens.home.Homescreen
import com.dickie.mwangai.ui.theme.screens.login.Login_screen2
import com.dickie.mwangai.ui.theme.screens.register.Register_screen
import com.dickie.mwangai.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination:String= route_SPLASH) {
    NavHost(navController=navController,
        modifier=modifier,
        startDestination = startDestination){
        composable(route_HOME) {
            Homescreen(navController)
        }
        composable(route_LOGIN) {
            Login_screen2(navController)
        }
        composable(route_REGISTER) {
            Register_screen(navController)
        }
       composable (route_SPLASH) {
           SplashScreen(navController)
       }
        composable(route_DashBOARD) {
            Dashboard_Screen(navController)
        }
        }
    }
