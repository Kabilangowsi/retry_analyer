package interview_prg;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.jayway.jsonpath.JsonPath;

public class Api_using_weather {
	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
		String json = IOUtils.toString(new URL(url), "UTF-8");
		List<Map<String, Object>> listofweather = new ArrayList<>();
		listofweather = JsonPath.parse(json).read("$.list");

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number:");

			String userpress = input.nextLine();

			String User_enter = input.nextLine();

			System.out.println("Enter the date:");
			String Enterdate = input.nextLine();

			int size_of_thejson = listofweather.size();

			for (int i = 0; i < size_of_thejson; i++) {
				String date = (String) listofweather.get(i).get("dt_txt");
				String[] weatherdateandtime = date.split(" ");
				String dateandtime = weatherdateandtime[0];

//--User press one and enter the date to get Temp of the input date
				if (userpress.equals("1") && dateandtime.equals(Enterdate)) {
					Map<String, Object> temp = (Map<String, Object>) listofweather.get(i).get("main");

					System.out.println("Temp of the input date:" + "  " + temp.get("temp"));

				}
//--User press Two and enter the date to get Wind speed of the input date

				if (userpress.equals("2") && dateandtime.equals(Enterdate)) {
					Map<String, Object> wind = (Map<String, Object>) listofweather.get(i).get("wind");

					System.out.println("Wind.speed of the input date:" + "    " + wind.get("speed"));

				}
//--User press Three and enter the date to get Pressure of the input date
				if (userpress.equals("3") && dateandtime.equals(Enterdate)) {

					Map<String, Object> pressure = (Map<String, Object>) listofweather.get(i).get("main");

					System.out.println("Pressure of the input date:" + "  " + pressure.get("pressure"));

				}


				if (User_enter.equals("0")) {

					System.exit(0);
				}

			}

		}
	}
}
