package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

	private MessageService messageService;

	@Autowired
	public MessagePrinter(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void printMessage(){
		System.out.println(this.messageService.getMessage());
	}
		
}
