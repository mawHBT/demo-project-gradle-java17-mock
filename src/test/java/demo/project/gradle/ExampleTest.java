package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExampleTest {

   private Callee calleeMock = Mockito.mock(Callee.class);

   @Test
   public void test() {

      when(calleeMock.method1()).thenReturn(456);

      assertEquals(456, calleeMock.method1());
   }

}
