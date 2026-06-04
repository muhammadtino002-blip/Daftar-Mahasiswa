package com.example.daftarmahasiswa.data

import com.example.daftarmahasiswa.R
import com.example.daftarmahasiswa.model.Mahasiswa

class MahasiswaSouce {
    fun loadMahasiswa() : List<Mahasiswa> {
        return listOf<Mahasiswa> (
            Mahasiswa(R.string.Joko, R.drawable.mahasiswa1),
            Mahasiswa(R.string.Wulan, R.drawable.mahasiswa2),
            Mahasiswa(R.string.Anwar, R.drawable.mahasiswa3)
        )
    }
}