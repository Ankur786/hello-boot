//package demo;
//
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JMSReceiver {
//
//    @JmsListener(destination = "hello-boot", containerFactory = "myFactory")
//    public void receiveMessage(String email) {
//        System.out.println("Received <" + email + ">");
//    }
//
//}