package data


//overall response
data class WeatherData(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<DailyWeatherInfo>,
    val message: Double
)