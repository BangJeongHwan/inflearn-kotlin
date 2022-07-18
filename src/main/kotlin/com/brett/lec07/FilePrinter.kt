package com.brett.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    /**
     * throws Exception 를 넣지 않아도 정상적으로 동작
     */
    fun readFile(){
        val currentFile = File(".")
        val file = File(currentFile.absoluteFile.toString() + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path : String){
        BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
    }
}