package poncho.boncho.affirmations.data

import poncho.boncho.affirmations.R
import poncho.boncho.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.quote0),
            Affirmation(R.string.quote1),
            Affirmation(R.string.quote2),
            Affirmation(R.string.quote3),
            Affirmation(R.string.quote4),
            Affirmation(R.string.quote5),
            Affirmation(R.string.quote6),
            Affirmation(R.string.quote7),
            Affirmation(R.string.quote8),
        )
    }
}