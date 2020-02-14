package test.props;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class TestProps {
    private static final String properties = "config.properties";
    public static void main(String[] args) {
        Properties prop = new Properties();

        try(InputStream resourceAsStream = TestProps.class.getClassLoader()
                .getResourceAsStream(properties)){
            prop.load(Objects.requireNonNull(resourceAsStream));
        }catch (IOException ioe){
            System.out.println("Unable to load properties file: " + properties);
        }

        System.out.println(prop.get("props.local.hello"));

        System.out.println(prop.get("props.mvn.hello"));


    }
}
