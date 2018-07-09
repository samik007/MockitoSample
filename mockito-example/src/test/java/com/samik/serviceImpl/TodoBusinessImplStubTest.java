package com.samik.serviceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.samik.service.TodoService;
import com.samik.service.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_Stub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> list = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, list.size());
	}
}
