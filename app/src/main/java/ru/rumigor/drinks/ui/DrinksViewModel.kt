package ru.rumigor.drinks.ui

import ru.rumigor.drinks.data.model.Drink

class DrinksViewModel (
    val strDrink : String,
    val strDrinkThumb: String,
    val strAlcoholic: String,
    val strInstructions: String,
    val strImageSource: String
)
{
    object Mapper{
        fun map(drink: Drink) =
            DrinksViewModel(
                drink.strDrink.uppercase(),
                drink.strDrinkThumb,
                drink.strAlcoholic,
                drink.strInstructions,
                drink.strImageSource
            )
    }
}