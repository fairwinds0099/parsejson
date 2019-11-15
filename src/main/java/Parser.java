import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Figures;
import model.Schema;
import org.junit.Test;

import java.io.IOException;

public class Parser extends Base {

    @Test
    public void parseMe() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Schema schema = objectMapper.readValue(schemaJson, Schema.class);

        Figures parametricFigures = schema.getParametric().getFigures();

        System.out.println(

                "\n##############\tPRINT PARAMETRIC FIGURES\t################\n" +
                parametricFigures.getFigureKeyOne() + "\n" +
                        parametricFigures.getFigureKeyTwo() + "\n" +
                        parametricFigures.getFigureKeyThree() + "\n" +
                        parametricFigures.getFigureKeyFour() + "\n" +
                        parametricFigures.getFigureKeyFive()
        );


// I want to override values default values, whene they are defined as parametric.


    }

}
