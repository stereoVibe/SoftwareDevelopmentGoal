package io.sokolvault.softwaredevgoal

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RescueTimeDatum {

    @SerializedName("id")
    @Expose
    var id : Int = 0
    @SerializedName("date")
    @Expose
    var date : String? = null
    @SerializedName("productivity_pulse")
    @Expose
    var productivityPulse : Int = 0
    @SerializedName("very_productive_percentage")
    @Expose
    var veryProductivePercentage : Float = 0.toFloat()
    @SerializedName("productive_percentage")
    @Expose
    var productivePercentage : Float = 0.toFloat()
    @SerializedName("neutral_percentage")
    @Expose
    var neutralPercentage : Float = 0.toFloat()
    @SerializedName("distracting_percentage")
    @Expose
    var distractingPercentage : Float = 0.toFloat()
    @SerializedName("very_distracting_percentage")
    @Expose
    var veryDistractingPercentage : Float = 0.toFloat()
    @SerializedName("all_productive_percentage")
    @Expose
    var allProductivePercentage : Float = 0.toFloat()
    @SerializedName("all_distracting_percentage")
    @Expose
    var allDistractingPercentage : Float = 0.toFloat()
    @SerializedName("uncategorized_percentage")
    @Expose
    var uncategorizedPercentage : Float = 0.toFloat()
    @SerializedName("business_percentage")
    @Expose
    var businessPercentage : Float = 0.toFloat()
    @SerializedName("communication_and_scheduling_percentage")
    @Expose
    var communicationAndSchedulingPercentage : Float = 0.toFloat()
    @SerializedName("social_networking_percentage")
    @Expose
    var socialNetworkingPercentage : Float = 0.toFloat()
    @SerializedName("design_and_composition_percentage")
    @Expose
    var designAndCompositionPercentage : Float = 0.toFloat()
    @SerializedName("entertainment_percentage")
    @Expose
    var entertainmentPercentage : Float = 0.toFloat()
    @SerializedName("news_percentage")
    @Expose
    var newsPercentage : Float = 0.toFloat()
    @SerializedName("software_development_percentage")
    @Expose
    var softwareDevelopmentPercentage : Float = 0.toFloat()
    @SerializedName("reference_and_learning_percentage")
    @Expose
    var referenceAndLearningPercentage : Float = 0.toFloat()
    @SerializedName("shopping_percentage")
    @Expose
    var shoppingPercentage : Int = 0
    @SerializedName("utilities_percentage")
    @Expose
    var utilitiesPercentage : Float = 0.toFloat()
    @SerializedName("total_hours")
    @Expose
    var totalHours : Float = 0.toFloat()
    @SerializedName("very_productive_hours")
    @Expose
    var veryProductiveHours : Float = 0.toFloat()
    @SerializedName("productive_hours")
    @Expose
    var productiveHours : Int = 0
    @SerializedName("neutral_hours")
    @Expose
    var neutralHours : Float = 0.toFloat()
    @SerializedName("distracting_hours")
    @Expose
    var distractingHours : Float = 0.toFloat()
    @SerializedName("very_distracting_hours")
    @Expose
    var veryDistractingHours : Float = 0.toFloat()
    @SerializedName("all_productive_hours")
    @Expose
    var allProductiveHours : Float = 0.toFloat()
    @SerializedName("all_distracting_hours")
    @Expose
    var allDistractingHours : Float = 0.toFloat()
    @SerializedName("uncategorized_hours")
    @Expose
    var uncategorizedHours : Float = 0.toFloat()
    @SerializedName("business_hours")
    @Expose
    var businessHours : Float = 0.toFloat()
    @SerializedName("communication_and_scheduling_hours")
    @Expose
    var communicationAndSchedulingHours : Float = 0.toFloat()
    @SerializedName("social_networking_hours")
    @Expose
    var socialNetworkingHours : Float = 0.toFloat()
    @SerializedName("design_and_composition_hours")
    @Expose
    var designAndCompositionHours : Float = 0.toFloat()
    @SerializedName("entertainment_hours")
    @Expose
    var entertainmentHours : Float = 0.toFloat()
    @SerializedName("news_hours")
    @Expose
    var newsHours : Float = 0.toFloat()
    @SerializedName("software_development_hours")
    @Expose
    var softwareDevelopmentHours : Float = 0.toFloat()
    @SerializedName("reference_and_learning_hours")
    @Expose
    var referenceAndLearningHours : Float = 0.toFloat()
    @SerializedName("shopping_hours")
    @Expose
    var shoppingHours : Int = 0
    @SerializedName("utilities_hours")
    @Expose
    var utilitiesHours : Float = 0.toFloat()
    @SerializedName("total_duration_formatted")
    @Expose
    var totalDurationFormatted : String? = null
    @SerializedName("very_productive_duration_formatted")
    @Expose
    var veryProductiveDurationFormatted : String? = null
    @SerializedName("productive_duration_formatted")
    @Expose
    var productiveDurationFormatted : String? = null
    @SerializedName("neutral_duration_formatted")
    @Expose
    var neutralDurationFormatted : String? = null
    @SerializedName("distracting_duration_formatted")
    @Expose
    var distractingDurationFormatted : String? = null
    @SerializedName("very_distracting_duration_formatted")
    @Expose
    var veryDistractingDurationFormatted : String? = null
    @SerializedName("all_productive_duration_formatted")
    @Expose
    var allProductiveDurationFormatted : String? = null
    @SerializedName("all_distracting_duration_formatted")
    @Expose
    var allDistractingDurationFormatted : String? = null
    @SerializedName("uncategorized_duration_formatted")
    @Expose
    var uncategorizedDurationFormatted : String? = null
    @SerializedName("business_duration_formatted")
    @Expose
    var businessDurationFormatted : String? = null
    @SerializedName("communication_and_scheduling_duration_formatted")
    @Expose
    var communicationAndSchedulingDurationFormatted : String? = null
    @SerializedName("social_networking_duration_formatted")
    @Expose
    var socialNetworkingDurationFormatted : String? = null
    @SerializedName("design_and_composition_duration_formatted")
    @Expose
    var designAndCompositionDurationFormatted : String? = null
    @SerializedName("entertainment_duration_formatted")
    @Expose
    var entertainmentDurationFormatted : String? = null
    @SerializedName("news_duration_formatted")
    @Expose
    var newsDurationFormatted : String? = null
    @SerializedName("software_development_duration_formatted")
    @Expose
    var softwareDevelopmentDurationFormatted : String? = null
    @SerializedName("reference_and_learning_duration_formatted")
    @Expose
    var referenceAndLearningDurationFormatted : String? = null
    @SerializedName("shopping_duration_formatted")
    @Expose
    var shoppingDurationFormatted : String? = null
    @SerializedName("utilities_duration_formatted")
    @Expose
    var utilitiesDurationFormatted : String? = null

}
