package com.example.booksapp

class BooksRepository {
    private var booksList : MutableList<Books> = mutableListOf()

    init{
        booksList.add(Books("Harry Potter 1","Description",""))
        booksList.add(Books("Daisy Jones & The Six","Description",""))
        booksList.add(Books("Normal People","Description",""))
        booksList.add(Books("It Ends With Us","Description",""))
        booksList.add(Books("Heartless","Description",""))
        booksList.add(Books("The Seven Husbands of Evelyn Hugo","Description",""))
        booksList.add(Books("Heartstopper: Volume 1","Description",""))
        booksList.add(Books("All This Time","Description",""))
        booksList.add(Books("Ugly Love","Description",""))
        booksList.add(Books("Never Saw Me Coming","Description",""))
        booksList.add(Books("Divergent","Description",""))
        booksList.add(Books("Never Let Me Go","Description",""))
        booksList.add(Books("The Picture of Dorian Gray","Description",""))
        booksList.add(Books("Wonder","Description",""))
        booksList.add(Books("Crooked Kingdom","Description",""))
        booksList.add(Books("La soledad de los números primos","Description",""))
        booksList.add(Books("El Jardin Olvidado","Description",""))

        booksList.add(Books("Harry Potter 1","Description",""))
        booksList.add(Books("Daisy Jones & The Six","Description",""))
        booksList.add(Books("Normal People","Description",""))
        booksList.add(Books("It Ends With Us","Description",""))
        booksList.add(Books("Heartless","Description",""))
        booksList.add(Books("The Seven Husbands of Evelyn Hugo","Description",""))
        booksList.add(Books("Heartstopper: Volume 1","Description",""))
        booksList.add(Books("All This Time","Description",""))
        booksList.add(Books("Ugly Love","Description",""))
        booksList.add(Books("Never Saw Me Coming","Description",""))
        booksList.add(Books("Divergent","Description",""))
        booksList.add(Books("Never Let Me Go","Description",""))
        booksList.add(Books("The Picture of Dorian Gray","Description",""))
        booksList.add(Books("Wonder","Description",""))
        booksList.add(Books("Crooked Kingdom","Description",""))
        booksList.add(Books("La soledad de los números primos","Description",""))
        booksList.add(Books("El Jardin Olvidado","Description",""))
    }

    fun getBooks () : MutableList<Books>{
        return booksList
    }
}