package com.mindorks.framework.parallaxandroid.util

import com.mindorks.framework.parallaxandroid.model.Books


class Util {

   fun getBooks() : ArrayList<Books> {
        val booksList: ArrayList<Books> = arrayListOf()
        booksList.add(Books( "Eloquent JavaScript, Second Edition",
             "A Modern Introduction to Programming",
             "Marijn Haverbeke"))
       booksList.add (Books( "Learning JavaScript Design Patterns",
           "A JavaScript and jQuery Developer s Guide",
           "Addy Osmani"))
       booksList.add (Books( "Speaking JavaScript",
           "An In-Depth Guide for Programmers",
           "Axel Rauschmayer"))
       booksList.add (Books( "Programming JavaScript Applications",
           "Robust Web Architecture with Node, HTML5, and Modern JS Libraries",
           "Eric Elliott"))
       booksList.add (Books( "Learning JavaScript Design Patterns",
           "A JavaScript and jQuery Developer s Guide",
           "Addy Osmani"))
       booksList.add (Books( "Speaking JavaScript",
           "An In-Depth Guide for Programmers",
           "Axel Rauschmayer"))
       booksList.add (Books( "Speaking JavaScript",
           "An In-Depth Guide for Programmers",
           "Axel Rauschmayer"))
       booksList.add (Books( "Programming JavaScript Applications",
           "Robust Web Architecture with Node, HTML5, and Modern JS Libraries",
           "Eric Elliott"))
        return booksList
    }
}