package socks_accounting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import socks_accounting.payload.StringToOperation;

/**
 * Spring configuration, where we register custom converter
 * for Operation enum
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToOperation());
    }
}
