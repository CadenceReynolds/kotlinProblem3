fun main() {
    //Project one
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    //Project two

        val steps = 4000
        val caloriesBurned = pedometerStepsToCalories(steps)
        println("Walking $steps steps burns $caloriesBurned calories")

    //Project three
    val time = timeSpentOnPhoneTodayVSYesterday(300, 250)
    println(time)

    //Project Four
    val indyWeather = cityWeatherInfo("Indianapolis",16, 34, 10 )
}
fun cityWeatherInfo(cityName: String, lowTemp: Int, highTemp: Int, rainChance: Int){
    println("City: $cityName")
    println("Low Temperature: $lowTemp, High Temperature: $highTemp")
    println("Chance of rain: $rainChance%")
}
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String = "Unknown Email"): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun timeSpentOnPhoneTodayVSYesterday(today: Int, yesterday: Int): Boolean {
    return 0 < today - yesterday
}
fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned

}