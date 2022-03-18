import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;

public class RESTAssured {
    @Test
    public void postmanFirstGetTest(){
        RestAssured.
                when().get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").
                then().assertThat().statusCode(200).
                and().body("args.foo2", is("bar2"));
//        Разберем данный пример:
//            Через when().get отправляется Get запрос на указанный URL.
//            then().assertThat().statusCode(200) валидирует, что мы получили 200 код, и значит все прошло успешно.
//            Ответ и последняя строчка проверяют что в body имеется аргумент foo2 со значением bar2.
    }

    @Test
    public void postRequestExampleTest() {
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
        JSONObject requestBody = new JSONObject();
        requestBody.put("FirstName", someRandomString);
        requestBody.put("LastName", someRandomString);
        requestBody.put("UserName", someRandomString);
        requestBody.put("Password", someRandomString);
        requestBody.put("Email", someRandomString + "@gmail.com");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("https://webhook.site/d463ae5c-a5c0-4a0e-ad24-59579bfa60ba");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println("The status code recieved: " + statusCode);

//        В данном запросе изначально задается произвольная переменная someRandomString, которая будет использоваться в
//        дальнейшем для заполнения тела запроса уникальными значениями. Далее создается новый JSON объект (requestBody),
//        с помощью которого, в дальнейшем, задаются отправляемые нами параметры, такие как FirstName, LastName,
//        UserName, Password и Email. С помощью request.post отправляется запрос на тот URL, что был сформирован на
//        WebHook. После того как запрос отработает, мы можем вернуться к WebHook и убедиться, что запрос был отправлен
//        корректно с теми параметрами, которые были указаны.
//        {
//            "UserName": "174035",
//                "Email": "174035@gmail.com",
//                "FirstName": "174035",
//                "LastName": "174035",
//                "Password": "174035"
//        }
    }

    @Test
    public void UpdateRecordsWinthPut(){
        int empid = 15410;
        RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1/";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "TestDate");
        requestParams.put("age", 23);
        requestParams.put("salary", 12000);
        request.body(requestParams.toString());
        Response response = request.put("/update/"+ empid);
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

//        В данном примере можно увидеть, что переменная empid = 15410 — это то, что будет обновляться нашим запросом.
//        После этого создается запрос, указывающий на конечную точку службы и создается JSON запрос, содержащий все поля,
//        которые будут обновлены. С помощью request.put отправляется запрос, и проверяется, что ответ — 200. Все это,
//        кроме самого первого шага, полностью перекликается с предыдущим запросом.
    }

    @Test
    public void delete() {
        int empid = 15410;
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        // Delete the request and check the response
        Response response = request.delete("/delete/"+ empid);
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);
        String jsonString =response.asString();
        Assert.assertEquals(jsonString.contains("successfully! deleted Records"), true);
        Assert.assertEquals(statusCode, 404);
        String jsonString2 =response.asString();
        Assert.assertEquals(jsonString2.contains("Record to delete not found"), true);

//        При завершении выполнения запроса будет удалена запись, которую мы изменяли ранее (empid = 15410).
    }
}