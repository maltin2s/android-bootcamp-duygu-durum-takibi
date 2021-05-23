package com.merve.duygudurumtakibi.duyguTakip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.merve.duygudurumtakibi.R
import com.merve.duygudurumtakibi.databinding.DuyguTakipFragmentBinding

class DuyguTakipFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //Binding
        val veriBagi: DuyguTakipFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.duygu_takip_fragment,container,false
        )

        return inflater.inflate(R.layout.duygu_takip_fragment, container, false)
    }



}