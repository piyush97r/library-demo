package com.sessions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {


    @Test
    public void the_default_number_of_books_should_be_1(){

        Library library = new Library();
        library.getBooks().size();
        int totalNumberOfBooks = library.getBooks().size();
        assertEquals(1,totalNumberOfBooks);
    }

}