package coneey.github.floating_search_view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import coneey.github.floating_search_view_library.FloatingSearchView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suggestions = ArrayList<Suggestion>()
        suggestions.add(Suggestion("Jakies miejsce 1"))
        suggestions.add(Suggestion("Kategoria 2"))
        suggestions.add(Suggestion("Test 3"))
        suggestions.add(Suggestion("Cokolwiek 4"))
        suggestions.add(Suggestion("Inne miejsce 5"))
        suggestions.add(Suggestion("Kolejna kategoria 6"))

        floating_search_view.setOnQueryChangeListener(FloatingSearchView.OnQueryChangeListener { oldQuery, newQuery ->
            //get suggestions based on newQuery

            //pass them on to the search view


            floating_search_view.swapSuggestions(suggestions.filter { it.name.contains(newQuery) })
        })

    }
}
