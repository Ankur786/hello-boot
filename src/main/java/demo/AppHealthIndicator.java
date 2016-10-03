//package demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.actuate.health.AbstractHealthIndicator;
//import org.springframework.boot.actuate.health.Health.Builder;
//import org.springframework.boot.actuate.metrics.Metric;
//import org.springframework.boot.actuate.metrics.repository.MetricRepository;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppHealthIndicator extends AbstractHealthIndicator {
//	
//	private  MetricRepository actuatorMetricRepository;
//	
//	
//	
//	
//	
//    @Autowired
//	public AppHealthIndicator(MetricRepository actuatorMetricRepository) {
//		super();
//		this.actuatorMetricRepository = actuatorMetricRepository;
//	}
//
//
//
//
//
//
//	@Override
//	protected void doHealthCheck(Builder builder) throws Exception {
//		try{
//			Iterable<Metric<?>> list = actuatorMetricRepository.findAll();
//			Streams.streamOf(list).forEach(element -> System.out.println(element));
//		}catch(Exception ex){
//			builder.outOfService().withDetail("Error Code", "Lots of 500 HTTP responses");
//		}
//		
//	}
//	
//
//}
