package com.akshatsahijpal.fullstackkotlin.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.akshatsahijpal.fullstackkotlin.data.ListAdap
import com.akshatsahijpal.fullstackkotlin.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var _bind: HomeFragmentBinding
    private val fetcher by viewModels<HomeViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _bind = HomeFragmentBinding.inflate(inflater, container, false)
        return _bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetcher.fetchAllData()
        fetcher.getAllData().observe(viewLifecycleOwner){
     //       Toast.makeText(requireContext(), "result:${it}", Toast.LENGTH_LONG).show()
            _bind.MainRecycler.adapter = ListAdap(it)
            _bind.MainRecycler.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}