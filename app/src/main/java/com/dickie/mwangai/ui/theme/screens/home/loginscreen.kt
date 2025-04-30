package com.dickie.mwangai.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dickie.mwangai.R
import com.dickie.mwangai.navigation.route_DashBOARD
import com.dickie.mwangai.navigation.route_LOGIN
import com.dickie.mwangai.navigation.route_REGISTER


@Composable
fun Homescreen( navController: NavHostController) {    //call the homescreen at the bottom
//    Image(modifier: Modifier = Modifier )

    Column (
        modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top){

        Text("dickie",
        color = Color.Magenta,  //any letter after = sign should be capital
         fontSize = 30.sp,
        fontFamily = FontFamily.SansSerif,
         fontStyle =FontStyle.Italic)
Spacer(modifier=Modifier.height((40.dp)))
Image(painter = painterResource(id = R.drawable.audi),
    contentDescription = "Circle Image",
    contentScale = ContentScale.Crop,
    modifier =Modifier
     .fillMaxWidth()
    .height(400.dp)
        .clip(CircleShape)
    .border(5.dp, Color.DarkGray, CircleShape)
        .rotate(360f))



        Spacer(modifier=Modifier.height(40.dp))
        Button(onClick = {navController.navigate(route_LOGIN)},
            modifier = Modifier.widthIn(300.dp)) {
                    Text(text="Login",fontSize=20.sp)}

        Spacer(modifier=Modifier.height(10.dp))
        Button(onClick = {navController.navigate(route_REGISTER) },
            modifier = Modifier.widthIn(300.dp)){
            Text(text="Register",fontSize=20.sp)}

        Spacer(modifier=Modifier.height(30.dp))
        Button(onClick = {navController.navigate(route_DashBOARD) },
            modifier = Modifier.widthIn(300.dp)){
            Text(text="Dashboard",color=Color.White,fontSize=20.sp, fontFamily = FontFamily.Cursive)}


        }


Spacer(modifier=Modifier.height(50.dp))
        Text("This is my first app",
        color = Color.Blue,
        fontSize  = 40.sp,
        fontFamily = FontFamily.Cursive,
        fontStyle = FontStyle.Normal)
//        var spacing = Space.TEXT_ALIGNMENT_TEXT_END
//        com.dickie.mwangai.ui.theme.screens.home.Button()

//        Spacer(modifier=Modifier.height(20.dp))
//        Button(onClick = {/*TODO*/ },
//            modifier = Modifier.widthIn(300.dp)){
//                    Text(text = "Register",fontSize=20.dp)
//        }


    }




@Preview
@Composable
private fun homeprev() {
    Homescreen(rememberNavController())


}