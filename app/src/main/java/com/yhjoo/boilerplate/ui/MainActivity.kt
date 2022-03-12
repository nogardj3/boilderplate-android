package com.yhjoo.boilerplate.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yhjoo.boilerplate.R
import com.yhjoo.boilerplate.databinding.ActivityMainBinding
import com.yhjoo.boilerplate.ui.viewmodels.SampleViewModel

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
    private val mainViewModel: SampleViewModel by viewModels()
//    private val recipeDetailViewModel: RecipeDetailViewModel by viewModels {
//        RecipeDetailViewModelFactory(
//            RecipeRepository(applicationContext),
//            ReviewRepository(applicationContext),
//            intent
//        )
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding.apply {
//            lifecycleOwner = this@RecipeDetailActivity
//            activity = this@RecipeDetailActivity
//            viewModel = recipeDetailViewModel
//        }

//        recipeDetailViewModel.allReviews.observe(this@RecipeDetailActivity, {
//            binding.recipedetailReviewEmpty.isVisible = it.isEmpty()
//            reviewListAdapter.submitList(it) {}
//        })

//        lifecycleScope.launch {
//            repeatOnLifecycle(Lifecycle.State.STARTED){
//                recipeDetailViewModel.eventResult.collect {
//                    if (it.first == RecipeDetailViewModel.Events.IS_DELETED)
//                        finish()
//                }
//            }
//        }
    }
}