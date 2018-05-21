package com.sml.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Component;

/**
 * Created by 神迷的亮
 * 2018-05-16 16:12
 */
@Component
@Slf4j
@EnableBinding(StreamsClient.class)
public class StreamReceiver
{
//  sid process(Object message)
//    {
//        log.info("streanReceiver: {}", message);
//    }
}
