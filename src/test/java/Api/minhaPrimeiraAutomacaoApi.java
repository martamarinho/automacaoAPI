package Api;
 
import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class minhaPrimeiraAutomacaoApi {

	
	private Response response;
	private Request request;
	
	
	//GET consultar
	@Test
	public void  consultarPetsAvalibe() {
		String get = "https://petstore.swagger.io/v2/pet";
		response = RestAssured.request(Method.GET,get);
		System.out.println(response.asString());
		System.out.println(response.statusCode()==200);
		
	}
	//POST criar
	@Test
	public void criarNovoPet() {
      given().log().all().contentType("application/json").body("{\r\n"
			+ "  \"id\": 200,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 0,\r\n"
			+ "    \"name\": \"string\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"tob\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 0,\r\n"
			+ "      \"name\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\"\r\n"
			+ "}").when().post("https://petstore.swagger.io/v2/pet").then().log().all();
	
	

	
	
	
	
	
	}
	//PUT editar
	@Test
	public void editarNovoPet() {
		 given().log().all().contentType("application/json").body("{\r\n"
				+ "    \"id\": 327,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"id\": 0,\r\n"
				+ "        \"name\": \"marta\"\r\n"
				+ "    },\r\n"
				+ "    \"name\": \"tob silva\",\r\n"
				+ "    \"photoUrls\": [\r\n"
				+ "        \"string\"\r\n"
				+ "    ],\r\n"
				+ "    \"tags\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 0,\r\n"
				+ "            \"name\": \"string\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"status\": \"available\"\r\n"
				+ "}").when().put("https://petstore.swagger.io/v2/pet").then().log().all();
		}

	// DELETE deletar
	@Test
	public void deletar() {
	 given().log().all().contentType("application/json")
		.header("petId","327").delete("https://petstore.swagger.io/v2/pet/327")
		.then().log().all();
	}
	
	public Request getRequest() {
		return request;
	}
	
	
	}
	
	
	
	
	
	
	

