import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class WeatherCall {


private static String weatherAPI = "http://api.openweathermap.org/geo/1.0/direct?q=Fredericton,CA&limit=5&appid=5e10eabc68acdf07cdf0296d658a3050";

private static String testAPI = "https://postman-echo.com/get";



    public static void main(String[] args) throws Exception {    
        HttpRequest.newBuilder(new URI(testAPI));




    }
}
