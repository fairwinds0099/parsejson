import com.fasterxml.jackson.databind.ObjectMapper;
import model.Schema;
import org.junit.Test;

import java.io.IOException;

public class Parser extends Base {

    @Test
    public void parseMe() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Schema schema = objectMapper.readValue(schemaJson, Schema.class);
        System.out.println(


                schema.getDefaults().getFigures().getFigureKeyFive() + "\n" +
                        schema.getParametric().getFigures().getFigureKeyFive()
        );

    }

}
