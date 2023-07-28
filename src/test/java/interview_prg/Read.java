package interview_prg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser a = new JSONParser();
		FileReader b = new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\Api\\weather.json");
		Object parse = a.parse(b);
		JSONObject c = (JSONObject) parse;
		Object object = c.get("Cod");
		String string = object.toString();
		System.out.println(string);

	}
}
