package ru.rumigor.drinks.data.drink.datasource

import io.reactivex.Maybe
import io.reactivex.Single
import ru.rumigor.drinks.data.InMemory
import ru.rumigor.drinks.data.model.Drink
import ru.rumigor.drinks.data.storage.DrinksStorage
import javax.inject.Inject

class CacheDrinkDataSourceImpl @Inject constructor(
    @InMemory private val drinksStorage: DrinksStorage
) : CacheDrinkDataSource {
    override fun retain(drink: Drink): Single<Drink> =
        drinksStorage
            .driksDao()
            .retain(drink)
            .andThen(Single.just(drink))

    override fun getDrinkByName(drinkName: String): Maybe<Drink> =
        drinksStorage
            .driksDao()
            .fetchDrinksByName(drinkName)
            .toMaybe()


}