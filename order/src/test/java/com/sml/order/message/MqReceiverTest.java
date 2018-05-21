package com.sml.order.message;

import com.sml.order.OrderApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqReceiverTest extends OrderApplicationTests
{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void testProcess() throws Exception
    {
        amqpTemplate.convertAndSend("myqueue", "sml");
    }

}   
  