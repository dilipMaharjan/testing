package junit.todo

import org.junit.Assert.assertEquals
import org.junit.Test
import junit.todo.stub.TodoServiceStub

/**
 * Created by Dilip Maharjan on 07/19/2018
 */
class TodoRepositoryTest {

    @Test
    fun retrieveRelatedTodosTest() {
        val todoService = TodoServiceStub()
        val todoRepository = TodoRepository(todoService)
        val kotlinTodos = todoRepository.retrieveRelatedToKotlin("dummy user")
        assertEquals(3, kotlinTodos.size)
    }
}