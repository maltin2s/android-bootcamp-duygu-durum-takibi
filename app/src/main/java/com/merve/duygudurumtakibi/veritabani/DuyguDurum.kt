package com.merve.duygudurumtakibi.veritabani

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Duygu_durum_tablosu")
data class DuyguDurum (
    @PrimaryKey(autoGenerate = true)
    var id :Long =0L,
    @ColumnInfo(name = "baslamaMilisaniyesi")
    val baslamaMilisaniyesi: Long = System.currentTimeMillis(),
    @ColumnInfo(name = "bitisMilisaniyesi")
    var bitisMilisaniyesi : Long = baslamaMilisaniyesi,
    @ColumnInfo(name = "durum")
    var durum: Int = -1
        )