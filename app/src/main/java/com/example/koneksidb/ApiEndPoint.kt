package com.example.koneksidb



class ApiEndPoint {
    companion object{

        private val SERVER = "http://localhost/phpmyadmin/db_structure.php?server=1&db=universitas_kotlin"
        val  CREATE = SERVER+"create_fakultas.php"
        val  READ = SERVER+"read_fakultas.php"
        val UPDATE = SERVER+"update_fakultas.php"
        val DELETE = SERVER+"delete_fakultas.php"
    }

}