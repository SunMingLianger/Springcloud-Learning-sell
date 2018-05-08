package com.sml.servicemiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication
{
    //    private static final Logger LOG = Logger.getLogger(EurekaClientApplication.class.getName());

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    //    @Autowired
    //    private RestTemplate restTemplate;
    //
    //    @Bean
    //    @LoadBalanced
    //    RestTemplate get()
    //    {
    //        return new RestTemplate();
    //    }
    //
    //    @RequestMapping("/hi")
    //    public String callHome()
    //    {
    //        LOG.log(Level.INFO, "calling trace service-hi  ");
    //        return restTemplate.getForObject("http://localhost:8082/miya", String.class);
    //    }
    //
    //    @RequestMapping("/info")
    //    public String info()
    //    {
    //        LOG.log(Level.INFO, "calling trace service-hi ");
    //
    //        return "i'm service-hi";
    //
    //    }
    //
    //        @Bean
    //        public AlwaysSampler defaultSampler()
    //        {
    //            return new AlwaysSampler();
    //        }

}
