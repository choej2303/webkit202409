package org.comstudy.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    // Logger를 올바르게 선언합니다.
    private static final Logger logger = LogManager.getLogger(UserTest.class);
    private static User user;

    public UserTest() {
        this.user = new User("1001", "kim", "kim@naver.com");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll..." + user.toString());
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll... " + user.toString());
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach..." + user.toString());
        logger.info("AfterEach.." + user.toString());
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach..." + user.toString());
        logger.info("BeforeEach.." + user.toString());
    }

    @Test
    void isValid() {
        assertTrue(user.isValid());
    }

    @Test
    void userBuilder() {
        user = User.builder().id("0001").name("Hong").email("Hong@hong").build();
        assertTrue(user.isValid());
    }
}
