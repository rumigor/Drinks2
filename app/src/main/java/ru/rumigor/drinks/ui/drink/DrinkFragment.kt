package ru.rumigor.drinks.ui.drink

import android.widget.Toast
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import ru.rumigor.drinks.R
import ru.rumigor.drinks.arguments
import ru.rumigor.drinks.ui.drinks.DrinksFragment

class DrinkFragment: MvpAppCompatFragment(R.layout.view_drink_fragment), DrinkView {

    companion object {

        fun newInstance(): Fragment =
            DrinkFragment()
                .arguments()

    }








    override fun showError(error: Throwable) {
        Toast.makeText(requireContext(), error.message, Toast.LENGTH_LONG).show()
    }
}