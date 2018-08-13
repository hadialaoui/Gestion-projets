package ma.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = { "ma.ibm" })
public class Main /*implements WebMvcConfigurer*/ {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	/*@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        // to serve static .html pages...
        registry.addResourceHandler("/static/**").addResourceLocations("/resources/static/");
	}*/

}
