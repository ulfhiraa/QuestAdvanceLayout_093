package com.example.pam_meet4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun playActivity(
    modifier: Modifier = Modifier){
    Column( // main column, column untuk menampung semua widget
            modifier = modifier.fillMaxSize()) {
            sectionHeader()

            Spacer(modifier = Modifier.padding(8.dp))        // memberi jarak antar baris (spasi)
            Text(text = "Kepada Yth :", Modifier.padding(start = 15.dp))
            Text(text = "Bapak/Ibu Dosen", Modifier.padding(start = 15.dp))

            MainSection(
                judulParam = "Nama", isiParam = "Muhajirah Ulfah"
            )
            MainSection(judulParam = "Kelas", isiParam = "B, Pengembangan Aplikasi Mobile")
            MainSection(judulParam = "NIM", isiParam = "20220140093")
            MainSection(judulParam = "Keterangan", isiParam = "Mahasiswa TI 2022")
    }
}

@Composable
fun sectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)) {
        Row {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(id = R.drawable.udayana),
                    contentDescription = "",
                    Modifier.size(100.dp).clip(shape = CircleShape) //agar permukaan gambar menjadi bulat
                )
                Icon(
                    Icons.Filled.Check, //untuk icon
                    contentDescription = "", // deskripsi icon
                    Modifier
                        .padding(end = 13.dp)
                        .size(25.dp),
                    tint = Color.Red,
                )
            }
            Column (Modifier.padding(15.dp)){
                Text(text = "Teknologi Informasi",
                    color = Color.White)
                Spacer(Modifier.padding(3.dp)) // memberi jarak atau spasi antar baris
                Text(text = "Universitas Udayana",
                    color = Color.White)
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isiParam:String){
    Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(8.dp)) {
        // horizontal alignment start untuk memulai tulisan secara horizontal dari kiri ke kanan

        Row (
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = judulParam, modifier = Modifier.weight(0.8f)) // weight untuk mengatur space isi data
            Text(text = " : ", modifier = Modifier.weight(0.2f))
            Text(
                text = "$isiParam",
                modifier = Modifier.weight(2f))
        }
    }
}


