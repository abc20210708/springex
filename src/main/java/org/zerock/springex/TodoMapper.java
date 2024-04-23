package org.zerock.springex;

import org.zerock.springex.domain.TodoVO;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);
}
