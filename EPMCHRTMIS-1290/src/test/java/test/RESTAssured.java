package test;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
public class RESTAssured {
    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").
                then().assertThat().statusCode(200).
                and().body("args.foo2", is("bar2"));
    }
}