package wk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import wk.dao.TestDao;
import wk.service.TestService;

/**
 * @Auther: wangkui
 * @Date: 2019/4/25 12:48
 * @Description:
 */
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    private TestDao testDao;

    public int testAction() {

        int i = testDao.selectCount();

        return i;
    }

}