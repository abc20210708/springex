package org.zerock.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ToString
@Service
public class SampleService {

    @Autowired
    // 자동 주입된 멤버는 올바른 Spring bean에서 정의되어야 합니다
    //https://dololak.tistory.com/564 참고 후 에러는 우선 해결됨
    private SampleDAO sampleDAO;

}
