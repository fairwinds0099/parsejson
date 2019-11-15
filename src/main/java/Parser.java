import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Schema;
import org.junit.Test;

import java.io.IOException;

public class Parser extends Base {

    @Test
    public void parseMe() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Schema schema = objectMapper.readValue(schemaJson, Schema.class);
        System.out.println(


                schema.getDefaults().getFigures().getFigureKeyFive() + "\n" +
                        schema.getParametric().getFigures().getFigureKeyFive() + "\n"
                        +
                        schema.getDefaults().getFigures().getFigureKeyOne() + "\n" +
                        schema.getParametric().getFigures().getFigureKeyOne()

        );

    }

}
