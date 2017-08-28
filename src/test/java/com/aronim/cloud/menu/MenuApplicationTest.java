package com.aronim.cloud.menu;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * User: Kevin W. Sewell
 * Date: 2015-06-03
 * Time: 15h33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestMenuApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuApplicationTest
{
    @Autowired
    private MenuService menuService;

    @LocalServerPort
    private int port;

    @Before
    public void setUp() throws Exception
    {
    }

}
