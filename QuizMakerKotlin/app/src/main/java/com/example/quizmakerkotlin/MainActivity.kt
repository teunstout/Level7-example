package com.example.quizmakerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: QuizViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigation()
        viewModel = ViewModelProviders.of(this).get(QuizViewModel::class.java)
    }

    private fun initNavigation() {
        // The NavController
        val navController = findNavController(R.id.navHostFragment)

        // Connect the navHostFragment with the ActionBar.
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val navController = findNavController(R.id.navHostFragment)
        return when (item?.itemId) {
            android.R.id.home -> {
                navController.navigateUp()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}
