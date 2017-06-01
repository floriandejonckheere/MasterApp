package config;

import domain.beer.BeerExpertBean;
import domain.beer.ColorBean;
import domain.beer.ExpertBean;
import domain.game.GameService;
import domain.inventory.Product;
import domain.inventory.ProductManager;
import domain.inventory.SimpleProductManager;
import domain.newsletter.FrameworkBean;
import java.util.Arrays;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
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

    /**
     * Game
     */
    @Bean
    public GameService GameService() {
        return new GameService();
    }

    /**
     * Inventory
     */
    @Bean
    public ProductManager getProductManager() {
        Product[] products = {new Product("Lamp", 5.751), new Product("Tafel", 75.2), new Product("Stoel", 22.791)};
        SimpleProductManager productManager = new SimpleProductManager();
        productManager.setProducts(Arrays.asList(products));
        
        return productManager;
    }

    /**
     * Handlers
     */
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
    
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("resources/messages");
        return messageSource;
    }
}
