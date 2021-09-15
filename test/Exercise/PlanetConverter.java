package Exercise;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class PlanetConverter implements ArgumentConverter {


    @Override
    public Planet convert(Object source, ParameterContext parameterContext) throws ArgumentConversionException {

        if(source instanceof Integer){
            int numberFromSun = (int) source;
            return new Planet("Earth","Sun",1,numberFromSun,93623581);
        }

        return null;
    }
}
