package com.example.jetpackloginui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.net.ContentHandler

@Composable
@Preview
fun loginscreen (){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 70.dp), horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.login), contentDescription = "",
            modifier = Modifier
                .size(120.dp, 100.dp)
                )

        Text(text = "Welcome Back",modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp), fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Italic, textAlign = TextAlign.Center, color = Color.Black
        )

        Text(text = "login into your Account", modifier=Modifier.padding(bottom = 20.dp))

        enterdetails()
    }

}


@Preview
@Composable
fun enterdetails(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 70.dp), horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(value = "", onValueChange = {},label = {
            Text(text = "Enter email address")
        })
        
        Spacer(modifier = Modifier.size(12.dp))

        OutlinedTextField(value = "", onValueChange = {},label = {
            Text(text = "Enter Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.size(30.dp))

        Button(onClick = {},modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(bottom = 8.dp)) {
            Text(text = "login",color = Color.White)
        }

        Text(text = "Forgot Password?", fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.size(25.dp))

        Text(text = "Or sign with", fontWeight = FontWeight.Light)

        Spacer(modifier = Modifier.size(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.drawable.google), contentDescription ="",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 20.dp))
            Image(painter = painterResource(id = R.drawable.mail), contentDescription ="",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 20.dp))
            Image(painter = painterResource(id = R.drawable.faceb), contentDescription ="",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 20.dp))

        }


    }
}