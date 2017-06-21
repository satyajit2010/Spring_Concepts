package hello;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Application {

	@Bean()
	@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Lazy
	MessageService mockMessageService(){
		System.out.println("I am being created");
		return new MessageService() {
			@PostConstruct
			private void onCreate(){
				System.out.println(this + " created");
			}
			
			@Override
			public String getMessage() {
				return "Hello World!";
			}
			
			@PreDestroy
			private void beforeDestroy() {
				System.out.println(this + " destroyed");
			}
		};
	}
	
	public static void main(String[] args) {
		System.out.println("starting...");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		System.out.println("being requested");
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
		
	}
	
}
