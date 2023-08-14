package com.ozancanguz.coinstats.ui.fragments.coinlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.coinstats.R
import com.ozancanguz.coinstats.databinding.FragmentCoinListBinding


class CoinListFragment : Fragment() {
    private var _binding: FragmentCoinListBinding? = null

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCoinListBinding.inflate(inflater, container, false)
        val view = binding.root


        return view

    }


}