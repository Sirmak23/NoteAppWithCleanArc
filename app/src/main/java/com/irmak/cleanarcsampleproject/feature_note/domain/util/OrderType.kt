package com.irmak.cleanarcsampleproject.feature_note.domain.util

sealed class OrderType {
    object Ascending:OrderType()
    object Descending:OrderType()
}