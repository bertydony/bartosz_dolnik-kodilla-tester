package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author1"));
        bookList.add(new BookDto("Title 2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        bookController.addBook(new BookDto("Title 1", "Author 1"));
        bookController.addBook(new BookDto("Title 2", "Author 2"));
        //then
        Mockito.verify(bookServiceMock).addBook(new BookDto("Title 1", "Author 1"));
        Mockito.verify(bookServiceMock).addBook(new BookDto("Title 2", "Author 2"));
    }
}