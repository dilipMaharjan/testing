package junit.todo

import junit.todo.api.TodoService
import junit.todo.model.Todo
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

/**
 * Created by Dilip Maharjan on 07/19/2018
 */
class TodoRepositoryMockTest {

    @Test
    fun retrieveRelatedTodosMockTest() {
        val todoService = mock(TodoService::class.java)
        val todos = listOf(
            Todo(1, "basics", "kotlin"),
            Todo(2, "intermediate", "kotlin"),
            Todo(3, "advance", "kotlin"),
            Todo(4, "basics", "java"),
            Todo(5, "intermediate", "java"),
            Todo(6, "advance", "java")
        )
        `when`(todoService.retriveTodos("dummy")).thenReturn(todos)

        val todoRepository = TodoRepository(todoService)
        val kotlinTodos = todoRepository.retrieveRelatedToKotlin("dummy")

        assertEquals(3, kotlinTodos.size)
    }

    @Test
    fun retrieveRelatedIsEmpty() {
        val todoService = mock(TodoService::class.java)

        val todoRepository = TodoRepository(todoService)
        val kotlinTodos = todoRepository.retrieveRelatedToKotlin("dummy")

        assertEquals(0, kotlinTodos.size)
    }
}