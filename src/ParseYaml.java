import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class ParseYaml {
    public void parse() {
        Yaml yaml = new Yaml();

        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(
                    new File(
                            "C:\\Users\\Hp\\OneDrive\\Desktop\\ResTest\\resources\\apis\\customer.yaml"
                    )
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<String, Object> obj = (Map<String, Object>) yaml.load(inputStream);

        System.out.println(obj);
    }
}
