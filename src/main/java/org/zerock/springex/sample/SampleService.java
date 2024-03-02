package org.zerock.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
public class SampleService {

    //@Autowired
    // 자동 주입된 멤버는 올바른 Spring bean에서 정의되어야 합니다
    private SampleDAO sampleDAO;

}
