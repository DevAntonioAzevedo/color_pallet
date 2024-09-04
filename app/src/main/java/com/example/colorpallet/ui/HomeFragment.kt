package com.example.colorpallet.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.colorpallet.R
import com.example.colorpallet.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initColors()
        initToolBar()
    }

    private fun initToolBar() {
        binding.btnAbout.setOnClickListener() {
            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }
    }

    private fun initColors() {
        binding.btnBlack.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorBlackFragment)
        }
        binding.btnGray.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorGrayFragment)
        }
        binding.btnYellow.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorYellowFragment)
        }
        binding.btnBlue.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorBlueFragment)
        }
        binding.btnRed.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorRedFragment)
        }
        binding.btnGreen.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorGreenFragment)
        }
        binding.btnPurple.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorPurpleFragment)
        }
        binding.btnOrange.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorOrangeFragment)
        }
        binding.btnPimk.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorPinkFragment3)
        }
        binding.btnBrown.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_colorBrownFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}