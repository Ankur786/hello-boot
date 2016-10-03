//package demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.health.AbstractHealthIndicator;
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JmsHealthIndicator extends AbstractHealthIndicator {
//
//	private final JmsTemplate jmsTemplate;
//
//	@Autowired
//	public JmsHealthIndicator(JmsTemplate jmsTemplate) {
//		this.jmsTemplate = jmsTemplate;
//	}
//
//	@Override
//	protected void doHealthCheck(Health.Builder builder) throws Exception {
//		try{
//			 jmsTemplate.convertAndSend("hello-boot", "info@example.com");
//			 System.out.println("JmsHealthIndicator Sending an email message.");
//			 builder.up();
//		}catch(Exception ex){
//			builder.outOfService().withDetail("Error Code", "ActiveMQ Down");
//		}
//		
//		
//	}
//
//}
