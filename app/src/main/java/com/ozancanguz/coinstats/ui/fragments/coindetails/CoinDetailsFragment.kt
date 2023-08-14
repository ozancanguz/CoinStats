package com.ozancanguz.coinstats.ui.fragments.coindetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.coinstats.databinding.FragmentCoinDetailsBinding


class CoinDetailsFragment : Fragment() {

    private var _binding: FragmentCoinDetailsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCoinDetailsBinding.inflate(inflater, container, false)
        return binding.root

    }


}