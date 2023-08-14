package com.ozancanguz.coinstats.data

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.coinstats.R
import com.ozancanguz.coinstats.data.apimodel.coin.Coin
import com.ozancanguz.coinstats.databinding.CoinlistRowLayoutBinding
import com.ozancanguz.coinstats.util.Util.Companion.loadImage


class CoinListAdapter : RecyclerView.Adapter<CoinListAdapter.CoinListViewHolder>() {

    private var coinList = emptyList<Coin>()

    fun setData(newData: List<Coin>) {
        coinList = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinListViewHolder {
        val binding = CoinlistRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoinListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return coinList.size
    }

    override fun onBindViewHolder(holder: CoinListViewHolder, position: Int) {
        val currentCoin = coinList[position]
        holder.bind(currentCoin)
    }

    inner class CoinListViewHolder(private val binding: CoinlistRowLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coin: Coin) {
            binding.coinnametextview.text = coin.name
            binding.coinsymboltextview.text=coin.symbol
            binding.coinImage.loadImage(coin.icon)
        }
    }
}
