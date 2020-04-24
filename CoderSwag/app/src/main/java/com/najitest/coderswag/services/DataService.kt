package com.najitest.coderswag.services

import com.najitest.coderswag.model.Category
import com.najitest.coderswag.model.Product

object DataService {

    val categories = listOf(
     Category("SHIRTS", "shirtimage"),
     Category("HODDIES", "hoodieimage"),
     Category("HAT", "hatimage"),
     Category("DIGITAL", "digitalgoodsimage")
    )

     val hats = listOf(
        Product("Devlopes Graphic Beanie", "$18", "hat01"),
        Product("Devlopes Hat Black", "$20", "hat02"),
        Product("Devlopes Hat White", "$18", "hat03"),
        Product("Devlopes Graphic Snapback", "$22", "hat04")
         )

    val hoodeis = listOf(
        Product("Devlopes Hoodie Gray", "$28", "hoodie01"),
        Product("DDevlopes Hoodie Red", "$32", "hoodie02"),
        Product("DDevlopes Gray Hoodie", "$28", "hoodie03"),
        Product("DDevlopes Black Hoodie", "$32", "hoodie04")
    )

    var shirts = listOf(
        Product("Devlopes Shirt Black", "$18", "shirt01"),
        Product("Devlopes Badge Light Gray", "$20", "shirt02"),
        Product("Devlopes Logo Shirt Red", "$22", "shirt03"),
        Product("Devlopes  Mustle", "$22", "shirt04"),
        Product("Kickflip Studio", "$18", "shirt05")
    )

}