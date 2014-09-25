package com.iprogi.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 25.09.14 13:49 <br>
 * @description: <br>
 */
public class UserTest {
    private static final Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testUser() {
        final User user = buildRecording();
        logger.info("Build user: {}", user);

    }

    private User buildRecording() {
        final User.Builder userBuilder = new User.Builder();
        userBuilder.withFirstname("Bob");
        userBuilder.withLastname("Smith");
        userBuilder.withSurname("W.");
        userBuilder.withAge(21);

        return userBuilder.build();
    }
}
