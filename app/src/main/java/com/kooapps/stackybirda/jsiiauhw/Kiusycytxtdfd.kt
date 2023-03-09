package com.kooapps.stackybirda

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
interface Twpqlpllpslp {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun cxkov(): Response<Rewlplpwplslpxc>
}

class Uwkwkokosd(private val gycv: Twpqlpllpslp) {
    suspend fun plpsalplpdlpwp() = gycv.cxkov()
}


interface Fpsppapokxc {
    @GET("x_ball.json")
    suspend fun vokkocxk(): Response<Ewokqkos>
}

@Keep
data class Ewokqkos(
    @SerializedName("x_ball_gcwqpso")
    val jxcko: String,
    @SerializedName("x_ball_vodtywtwys")
    val fpldlpsldp: String,
    @SerializedName("x_ball_amcnxyyd")
    val wplplpspsl: String,
)
class Czplzxkos(private val txyzcuh: Fpsppapokxc) {
    suspend fun lxzoocjiijdji() = txyzcuh.vokkocxk()
}

@Keep
data class Rewlplpwplslpxc(
    @SerializedName("countryCode")
    val ncvuhbhufd: String,
)














