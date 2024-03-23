package org.zerock.springex;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor
public class SampleService {

    @Qualifier("normal")
    //@Autowired
    // 자동 주입된 멤버는 올바른 Spring bean에서 정의되어야 합니다
    //https://dololak.tistory.com/564 참고 후 에러는 우선 해결됨
    private SampleDAO sampleDAO;

}
