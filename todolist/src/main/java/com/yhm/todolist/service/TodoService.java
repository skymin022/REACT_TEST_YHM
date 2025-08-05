package com.yhm.todolist.service;


import com.yhm.todolist.domain.Todos;

public interface TodoService extends BaseService<Todos> {
    // 전체 완료
    public boolean completeAll() throws Exception;
    // 전체 삭제
    public boolean deleteAll() throws Exception;
}
