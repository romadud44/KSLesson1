package org.example.lesson4

/**
 * При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу, которая проверяет,
 * соответствует ли груз категории "Average". Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг
 * (включительно), и объем меньше 100 литров (не включительно).
 *
 * Создай программу, которая отображает соответствие данных груза категории "Average". Вывод программы может выглядеть так:
 * "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
 *
 * - укажи предварительно заданные параметры категории;
 * - проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
 * - сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */
fun main(){
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolumeMax = 100

    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100
    println("Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует категории 'Average': ${cargoOneWeight > averageWeightMin && cargoOneWeight <= averageWeightMax && cargoOneVolume < averageVolumeMax}")
    println("Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует категории 'Average': ${cargoTwoWeight > averageWeightMin && cargoTwoWeight <= averageWeightMax && cargoTwoVolume < averageVolumeMax}")

}