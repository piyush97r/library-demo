package com.sessions;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before ALl");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    public void setup(){
        library = new Library();
    }
    @Test
    public void the_default_number_of_books_should_be_1(){

        //Library library = new Library();
        library.getBooks().size();
        int totalNumberOfBooks = library.getBooks().size();
        assertEquals(1,totalNumberOfBooks);
    }
    @Test
    public void adding_to_catalogue_should_increase_the_size_of_books_and_id_should_be_2(){
       // Library library = new Library();
        Book newlyCreatedBook = library.addToCatalogue("Discovery Of India","Jawaharlal Nehru",432,11.99);
        assertEquals(2,newlyCreatedBook.getId());
        int totalBooks = library.getBooks().size();

        assertThat(totalBooks,equalTo(2) );

        List<Book> availableBooks = library.getBooks();
        assertThat(library.getBooks(),hasItem(newlyCreatedBook));
    }

    @Test
    public void findBookByName_called_with_bookname_should_return_book_object(){
      //  Library library = new Library();
        Book book = library.findBookByName("The God Of Small Things");
        Assertions.assertNotNull(book);
    }

    @Test
    public void findBookByName_called_with_nonexistant_bookname_should_return_null(){
       // Library library = new Library();
        Book book = library.findBookByName("The God of Big Things");
        assertNull(book);
    }
    @Test
    public void when_returning_book_receipt_should_be_returned(){
        RentedBook rentedBook=library.rent("The God Of Small Things");
        Double amount=3.0;
        Receipt receipt=library.returnBook(rentedBook,amount);
        assertNotNull(receipt);
        assertThat(receipt.bookName,equalTo("The God Of Small Things"));
        assertThat(receipt.receiptDate,equalTo(LocalDate.now()));


    }
}