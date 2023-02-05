package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class Dog extends Animal{
    @Override
    @Bean(name = "dog")
    public String toString() {
        return "Im are dog";
    }
}
