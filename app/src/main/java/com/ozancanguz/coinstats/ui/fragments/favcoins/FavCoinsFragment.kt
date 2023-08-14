package com.ozancanguz.coinstats.ui.fragments.favcoins

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.coinstats.R
import com.ozancanguz.coinstats.databinding.FragmentFavCoinsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavCoinsFragment : Fragment() {
    private var _binding: FragmentFavCoinsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavCoinsBinding.inflate(inflater, container, false)
        val view = binding.root


        return view


    }


}