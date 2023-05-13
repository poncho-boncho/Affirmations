package poncho.boncho.affirmations.data

import poncho.boncho.affirmations.R
import poncho.boncho.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.quote0, R.drawable.image0),
            Affirmation(R.string.quote1,R.drawable.image1),
            Affirmation(R.string.quote2,R.drawable.image2),
            Affirmation(R.string.quote3,R.drawable.image3),
            Affirmation(R.string.quote4,R.drawable.image4),
            Affirmation(R.string.quote5,R.drawable.image5),
            Affirmation(R.string.quote6,R.drawable.image6),
            Affirmation(R.string.quote7,R.drawable.image7),
            Affirmation(R.string.quote8,R.drawable.image8),
        )
    }
}