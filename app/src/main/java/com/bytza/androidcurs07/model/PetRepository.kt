package com.bytza.androidcurs07.model

import com.bytza.androidcurs07.R
import kotlin.random.Random

class PetRepository {
    private var list = mutableListOf<Pet>()
    private var images = intArrayOf(
        R.drawable.d1,
        R.drawable.d2,
        R.drawable.d3,
        R.drawable.d4,
        R.drawable.d5,
        R.drawable.d6,
        R.drawable.d7,
        R.drawable.d8
    )
    private var names = arrayListOf<String>(
        "Жучка", "Красавчик", "Бим", "Каштан", "Мотя", "Мухтар", "Полкан", "Потап", "Батлер", "Николя", "Краля", "Пумба", "Скиф", "Хвостик"
    )
    private var owners = arrayListOf<String>(
        "Иван", "Богдан", "Ибрагим", "Аня", "Маня", "Таня", "Галя", "Юля", "Вера", "Коля", "Миша", "Гриша", "Саша", "Маша"
    )

    init {
        for (i in 0..100)
            list.add(Pet(i, names[Random.nextInt(0, names.size)], owners[Random.nextInt(0, owners.size)], 1910+ Random.nextInt(0,12), images[i % 8]) )
    }

    public fun getAll() = list

    public fun getById(id: Int) = list[id]

    public fun getCount() = list.size

}