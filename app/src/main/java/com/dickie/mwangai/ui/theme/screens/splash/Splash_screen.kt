package com.dickie.mwangai.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dickie.mwangai.R
import com.dickie.mwangai.navigation.route_HOME
import kotlinx.coroutines.delay



@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(Unit){
        delay(3000)
        navController.navigate(route_HOME)
    }
    Box(
       contentAlignment = Alignment.Center,
        modifier = Modifier .fillMaxSize()

    ){
        Image(
            painter = painterResource(id = R.drawable.view),
            contentDescription = "SplashScreen logo",
            modifier = Modifier.size(350.dp))




    }
}