import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class JSONParser {

    private ScriptEngine engine;

    public JSONParser() {
        ScriptEngineManager sem = new ScriptEngineManager();
        this.engine = sem.getEngineByName("javascript");
    }

    public Map parseJson(String str) throws IOException, ScriptException {
        String json = new String(str);
        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = this.engine.eval(script);

        return (Map)result;
    }
}

public class JavaGetRequest {

    private static HttpURLConnection con;

    public static void main(String[] args) throws Exception,
            ProtocolException, IOException {

        String url = "http://api.icndb.com/jokes/random";

        JSONParser parse = new JSONParser();

        try {

            URL myurl = new URL(url);
            con = (HttpURLConnection) myurl.openConnection();

            con.setRequestMethod("GET");

            StringBuilder content;

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()))) {

                String line;
                content = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            
            Map info = parse.parseJson(content.toString());

            System.out.println("\n\n\n" + content.toString() + "\n\n\n");
            System.out.println("El chiste es: " + ((Map)info.get("value")).get("joke"));

        } finally {
            
            con.disconnect();
        }
    }
}