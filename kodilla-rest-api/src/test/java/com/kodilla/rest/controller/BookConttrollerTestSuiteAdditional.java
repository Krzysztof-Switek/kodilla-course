package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

@WebMvcTest(BookController.class)
class BookControllerTestSuiteAdditional {

    @MockBean
    private BookService bookService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldAddBook() throws Exception {
        // given
        BookDto bookDto = new BookDto("Title 1", "Author 1");
        Gson gson = new Gson();
        String json = gson.toJson(bookDto);

        // when
        mockMvc.perform(MockMvcRequestBuilders.post("/books")
                        .contentType("application/json")
                        .content(json))
                .andExpect(MockMvcResultMatchers.status().isOk());

        // then
        Mockito.verify(bookService, times(1)).addBook(any(BookDto.class));
    }

}
