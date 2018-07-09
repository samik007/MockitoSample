package com.samik.serviceImpl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.samik.service.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_Stub() {
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos 
				= Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn To Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> list = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, list.size());
	}
}
