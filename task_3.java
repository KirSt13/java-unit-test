import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
// Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
    // Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        { 17, false},
		{ 18, true},
        { 20, false},
        { 21, true}, // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	int age = 21; // Передай сюда возраст пользователя
    boolean result = true; 
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Вернет true, потому что человек достиг совершеннолетия", result, isAdult);
	}
}
