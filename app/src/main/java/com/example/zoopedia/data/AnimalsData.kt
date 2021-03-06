package com.example.zoopedia.data

object AnimalsData {
    private val data: ArrayList<AnimalModel> = arrayListOf()

    private fun addData() {
        data.add(
            AnimalModel(
                name = "JAGUAR",
                status = "Near Threatened",
                scientificName = "Panthera onca",
                length = "Up to 6 ft.",
                habitats = "Forests, Grasslands",
                desc = "Jaguars are strong swimmers and climbers and require large areas of tropical rain forest and stretches of riverbank to survive. Hunting and habitat loss due to deforestation continue to threaten the survival of these marvelous cats. WWF has worked with the government of Brazil to successfully protect large blocks of Amazon forest for the jaguar. In Peru, WWF continues to track jaguars to learn more about their habitat requirements.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Jaguar_GPN7474/hero_full/5w6xbrnkmk_Responsible_Forestry_8.10.2012_Biodiversiry_Loss_HI_7474.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "CHIMPANZEE",
                status = "Endangered",
                scientificName = "Pan troglodytes",
                length = "-",
                habitats = "Forests (moist and dry forests), Savannah Woodlands, and Grassland-Forest mosaics",
                desc = "Forests (moist and dry forests), Savannah Woodlands, and Grassland-Forest mosaics",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/HERO_Chimpanzee_Uganda/hero_full/5sgqq60jdd_Medium_WW215321.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "SEA TURTLE",
                status = "Endangered",
                scientificName = "Cheloniidae and Dermochelyidae families",
                length = "2-6 ft.",
                habitats = "Open water and coasts",
                desc = "Seven different species of sea (or marine) turtles grace our ocean waters, from the shallow seagrass beds of the Indian Ocean, to the colorful reefs of the Coral Triangle and the sandy beaches of the Eastern Pacific. While these highly migratory species periodically come ashore to either bask or nest, sea turtles spend the bulk of their lives in the ocean. WWF's work on sea turtles focuses on five of those species: green, hawksbill, loggerhead, leatherback, and olive ridley.\n\nOver the last 200 years, human activities have tipped the scales against the survival of these ancient mariners. Slaughtered for their eggs, meat, skin, and shells, sea turtles suffer from poaching and over-exploitation. They also face habitat destruction and accidental capture???known as bycatch???in fishing gear. Climate change has an impact on turtle nesting sites; it alters sand temperatures, which then affects the sex of hatchlings. Nearly all species of sea turtle are now classified as endangered, with three of the seven existing species being critically endangered.\n\nWWF is committed to stopping the decline of sea turtles and works for the recovery of the species. We work to secure environments in which both turtles and the people that depend upon them can survive.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Sea_Turtle_Hol_Chan_Marine_Reserve_WW1105958/hero_full/p35wuxwr3_Sea_Turtle_Hol_Chan_Marine_Reserve_WW1105958.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "RHINO",
                status = "Endangered",
                scientificName = "Rhino",
                length = "4-10 ft.",
                habitats = "Tropical and subtropical grasslands, savannahs and shrublands, tropical moist forests, deserts and shrublands",
                desc = "Rhinos once roamed many places throughout Europe, Asia, and Africa and were known to early Europeans who depicted them in cave paintings. At the beginning of the 20th century, 500,000 rhinos roamed Africa and Asia. By 1970, rhino numbers dropped to 70,000, and today, around 27,000 rhinos remain in the wild. Very few rhinos survive outside national parks and reserves due to persistent poaching and habitat loss over many decades. Three species of rhino???black, Javan, and Sumatran???are critically endangered. Today, a small population of Javan rhinos is found in only one national park on the northern tip of the Indonesian island of Java. A mainland subspecies of the Javan rhino was declared extinct in Vietnam in 2011. Successful conservation efforts have led to an increase in the number of greater one-horned (or Indian) rhinos, from around 200 at the turn of the 20th century to around 3,700 today. The greater one-horned rhino is one of Asia???s biggest success stories, with their status improving from endangered to vulnerable following significant population increases. However, the species still remains under threat from poaching for its horn and from habitat loss and degradation.\n\nIn Africa, southern white rhinos, once thought to be extinct, now thrive in protected sanctuaries and are classified as near threatened. But the western black rhino and northern white rhinos have recently become extinct in the wild. The only two remaining northern white rhino are kept under 24-hour guard in Ol Pejeta Conservancy in Kenya. Black rhinos have doubled in number over the past two decades from their low point of fewer than 2,500 individuals, but total numbers are still a fraction of the estimated 100,000 that existed in the early part of the 20th century.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Black_Rhino_WW1106963/hero_full/4xzhm81mi7_Black_Rhino_WW1106963.jpg"
            )
        )
        data.add(
            AnimalModel(
                name = "MARINE IGUANA",
                status = "Vulnerable",
                scientificName = "Amblyrhynchus cristatus",
                length = "2-5.6 feet long",
                habitats = "Oceans",
                desc = "One of the main nesting zones for iguanas is located on a central tourist beach in the waterfront area of Puerto Villamil on Isabela Island. For several years, the Gal???pagos National Park protected only the central part of the nesting zone. In 2012, WWF, the Municipality of Isabela and the Charles Darwin Foundation extended the protected area to include the entire nesting zone. As part of this effort, additional signs for both tourists and local communities inform them about the importance of this nesting zone. A temporary fence was also built to protect the area and allow iguanas to pass through.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/HERO_Marine_Iguana_Ecuador/hero_full/7dw8jwf8l9_Medium_WW288386.jpg"
            )
        )
        data.add(
            AnimalModel(
                name = "ELEPHANT",
                status = "-",
                scientificName = "Amblyrhynchus cristatus",
                length = "18-24 ft.",
                habitats = "forest",
                desc = "Elephants are the largest land mammals on earth and have distinctly massive bodies, large ears, and long trunks. They use their trunks to pick up objects, trumpet warnings, greet other elephants, or suck up water for drinking or bathing, among other uses. Both male and female African elephants grow tusks and each individual can either be left- or right-tusked, and the one they use more is usually smaller because of wear and tear. Elephant tusks serve many purposes. These extended teeth can be used to protect the elephant's trunk, lift and move objects, gather food, and strip bark from trees. They can also be used for defense. During times of drought, elephants even use their tusks to dig holes to find water underground.\n\nTwo genetically different African species exist: the savanna elephant and the forest elephant, with a number of characteristics that differentiate them both. The African savanna elephant is the largest elephant species, while the Asian forest elephant and the African forest elephant are of a comparable, smaller size.\n\nAsian elephants differ in several ways from their African relatives, with more than 10 distinct physical differences between them. For example, Asian elephants' ears are smaller compared to the large fan-shaped ears of the African species. Only some male Asian elephants have tusks, while both male and female African elephants grow tusks.\n\nLed by a matriarch, elephants are organized into complex social structures of females and calves, while male elephants tend to live in isolation or in small bachelor groups. A single calf is born to a female once every four to five years and after a gestation period of 22 months???the longest of any mammal. Calves are cared for by the entire herd of related females. Female calves may stay with their maternal herd for the rest of their lives, while males leave the herd as they reach puberty. Forest elephants' social groups differ slightly and may be comprised of only an adult female and her offspring. However, they may congregate in larger groups in forest clearings where resources are more abundant.\n\nElephants need extensive land areas to survive and meet their ecological needs, which includes food, water, and space. On average, an elephant can feed up to 18 hours and consume hundreds of pounds of plant matter in a single day. As a result, as they lose habitat, they often come into conflict with people in competition for resources.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/African_Elephant_Kenya_112367/hero_full/6tzzuw246j_WW187785.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "GIANT PANDA",
                status = "Vulnerable",
                scientificName = "Ailuropoda melanoleuca",
                length = "18-24 ft.",
                habitats = "Temperate broadleaf and mixed forests of southwest China",
                desc = "The panda, with its distinctive black and white coat, is adored by the world and considered a national treasure in China. This bear also has a special significance for WWF because it has been our logo since our founding in 1961.\n\nPandas live mainly in temperate forests high in the mountains of southwest China, where they subsist almost entirely on bamboo. They must eat around 26 to 84 pounds of it every day, depending on what part of the bamboo they are eating. They use their enlarged wrist bones that function as opposable thumbs.\n\nA newborn panda is about the size of a stick of butter???about 1/900th the size of its mother???but females can grow up to about 200 pounds, while males can grow up to about 300 pounds as adults. These bears are excellent tree climbers despite their bulk.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Panda_in_Tree/hero_full/2wgwt9z093_Large_WW170579.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "RED PANDA",
                status = "Endangered",
                scientificName = "Ailurus fulgens",
                length = "2 feet",
                habitats = "Temperate forests",
                desc = "The red panda is slightly larger than a domestic cat with a bear-like body and thick russet fur. The belly and limbs are black, and there are white markings on the side of the head and above its small eyes. Red pandas are very skillful and acrobatic animals that predominantly stay in trees. Almost 50% of the red panda???s habitat is in the Eastern Himalayas. They use their long, bushy tails for balance and to cover themselves in winter, presumably for warmth. Primarily an herbivore, the name panda is said to come from the Nepali word ???ponya,??? which means bamboo or plant eating animal.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/HERO_Red_Panda_279141/hero_full/7bkg4jrmln_XL_279141.jpg"
            )
        )

        data.add(
            AnimalModel(
                name = "GALAPAGOS PENGUIN",
                status = "Endangered",
                scientificName = "Spheniscus mendiculus",
                length = "19 inches long",
                habitats = "Oceans",
                desc = "This is the only penguin species found north of the equator and in the Gal???pagos.",
                image = "https://files.worldwildlife.org/wwfcmsprod/images/Galapagos_Penguins/hero_full/6txm03g5p2_flipMedium_WW1103163.jpg"
            )
        )
    }

    fun getAnimalsData(): ArrayList<AnimalModel> {
        addData()
        return data
    }
}