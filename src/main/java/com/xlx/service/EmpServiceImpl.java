package com.xlx.service;

import com.xlx.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {
    @Override
    public void add(Emp emp) {

    }

    @Override
    public void delete(Emp emp) {

    }

    @Override
    public void update(Emp emp) {

    }

    @Override
    public List<Emp> query() {
        return null;
    }
}
