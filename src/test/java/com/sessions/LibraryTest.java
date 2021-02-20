package com.sessions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {


    @Test
    public void the_default_number_of_books_should_be_1(){

        Library library = new Library();
        library.getBooks().size();
        int totalNumberOfBooks = library.getBooks().size();
        assertEquals(1,totalNumberOfBooks);
    }
    @Test
    public void adding_to_catalogue_should_increase_the_size_of_books_and_id_should_be_2(){
        Library library = new Library();
        Book newlyCreatedBook = library.addToCatalogue("Discovery Of India","Jawaharlal Nehru",432,11.99);
        assertEquals(2,newlyCreatedBook.getId());
        int totalBooks = library.getBooks().size();

        assertThat(totalBooks,equalTo(2) );

        List<Book> availableBooks = library.getBooks();
        assertThat(library.getBooks(),hasItem(newlyCreatedBook));
    }

    @Test
    public void findBookByName_called_with_bookname_should_return_book_object(){
        Library library = new Library();
        Book book = library.findBookByName("The God Of Small Things");
        Assertions.assertNotNull(book);
    }

    @Test
    public void findBookByName_called_with_nonexistant_bookname_should_return_null(){
        Library library = new Library();
        Book book = library.findBookByName("The God of Big Things");
        assertNull(book);
    }

}