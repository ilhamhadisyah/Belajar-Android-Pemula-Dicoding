package com.example.zoopedia.data

object AnimalsData {
    private val data: ArrayList<AnimalModel> = arrayListOf()

    fun addData() {
        data.add(
            AnimalModel(
                name = "JAGUAR",
                status = "Near Threatened",
                length = "Up to 6 ft.",
                scientificName = "Panthera onca",
                habitats = "Forests, Grasslands",
                desc = "Jaguars are strong swimmers and climbers and require large areas of tropical rain forest and stretches of riverbank to survive. Hunting and habitat loss due to deforestation continue to threaten the survival of these marvelous cats. WWF has worked with the government of Brazil to successfully protect large blocks of Amazon forest for the jaguar. In Peru, WWF continues to track jaguars to learn more about their habitat requirements.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Jaguar_GPN7474/hero_full/5w6xbrnkmk_Responsible_Forestry_8.10.2012_Biodiversiry_Loss_HI_7474.jpg"
            )
        )
    }
}