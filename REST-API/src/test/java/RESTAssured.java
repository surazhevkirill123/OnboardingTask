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
        /*Разберем данный пример:
            Через when().get отправляется Get запрос на указанный URL.
            then().assertThat().statusCode(200) валидирует, что мы получили 200 код, и значит все прошло успешно.
            Ответ и последняя строчка проверяют что в body имеется аргумент foo2 со значением bar2.*/
    }

//    @Test
//    public void postRequestExampleTest() {
//        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("FirstName", someRandomString);
//        requestBody.put("LastName", someRandomString);
//        requestBody.put("UserName", someRandomString);
//        requestBody.put("Password", someRandomString);
//        requestBody.put("Email", someRandomString + "@gmail.com");
//        RequestSpecification request = RestAssured.given();
//        request.header("Content-Type", "application/json");
//        request.body(requestBody.toString());
//        Response response = request.post("https://webhook.site/d463ae5c-a5c0-4a0e-ad24-59579bfa60ba");
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);
//        System.out.println("The status code recieved: " + statusCode);
//    }
}