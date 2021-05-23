package com.merve.duygudurumtakibi.veritabani

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface VeriTabanaiErisimNesnesi {
    @Insert
    fun ekle(duyguDurum: DuyguDurum)

    @Query (value = "SELECT * FROM duygu_durum_tablosu ORDER BY id DESC")
    fun tumDuyguVerisiniGetir() :LiveData<List<DuyguDurum>>

    @Query (value = "SELECT * FROM duygu_durum_tablosu ORDER BY id =:kimlik")
    fun getir(kimlik: Long):DuyguDurum?

    @Query (value = "SELECT * FROM duygu_durum_tablosu ORDER BY id DESC LIMIT 1")
    fun sonDuyguDurumuGetir():DuyguDurum?

    @Update
    fun Guncelle(duyguDurum: DuyguDurum)

    @Query(value = "DELETE FROM duygu_durum_tablosu")
    fun tumVeriyiTemizle()

    @Query(value = "DELETE FROM duygu_durum_tablosu WHERE id=:kimlik")
    fun duyguDurumSil(kimlik:Long)


}