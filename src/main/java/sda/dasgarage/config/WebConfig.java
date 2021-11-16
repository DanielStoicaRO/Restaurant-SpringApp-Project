package sda.dasgarage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/bootstrap/**")
                .addResourceLocations("classpath:/static/bootstrap/");

        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:/static/");

        registry.addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/static/fonts/");

        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");

        registry.addResourceHandler("/imagines/**")
                .addResourceLocations("classpath:/static/imagines/");

        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/");

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/");

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}
