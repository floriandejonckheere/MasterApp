package config;

import domain.beer.BeerExpertBean;
import domain.beer.ColorBean;
import domain.beer.ExpertBean;
import domain.newsletter.FrameworkBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("controller")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * Beer
     */
    @Bean
    public ColorBean colorBean() {
        return new ColorBean();
    }
    
    @Bean
    public ExpertBean getBeerExpertBean() {
        return new BeerExpertBean();
    }

    /**
     * Newsletter
     */
    @Bean
    public FrameworkBean getFrameworkBean() {
        return new FrameworkBean();
    }

    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("resources/css/");
    }

    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver
                = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}