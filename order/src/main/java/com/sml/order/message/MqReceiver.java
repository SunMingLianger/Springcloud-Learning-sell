package com.sml.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by 神迷的亮
 * 2018-05-16 15:33
 */
@Slf4j
@Component
public class MqReceiver
{
    @RabbitListener(queues = "myqueue")
    //自动创建队列exchange he queue bind
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myqueue"), exchange = @Exchange("myexchange")))
    public void process(String msg)

    {
        log.info("mq msg = {}", msg);
    }

}
