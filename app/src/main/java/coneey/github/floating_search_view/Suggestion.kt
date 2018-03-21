package coneey.github.floating_search_view

import coneey.github.floating_search_view_library.suggestions.model.SearchSuggestion
import kotlinx.android.parcel.Parcelize

@Parcelize
class Suggestion(val name: String) : SearchSuggestion {
    override fun getBody(): String {
        return name
    }

}