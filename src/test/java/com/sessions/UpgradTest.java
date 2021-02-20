package com.sessions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.sessions.Upgrad.prime;
import static org.junit.jupiter.api.Assertions.*;

class UpgradTest {

    /*@Test
    public void Test_if_square_root_is_correct(){
        Upgrad upgrad = new Upgrad();
        upgrad.prime(int n);
        assertEquals(0,false);
    }*/

    @Test
    public void testPrime() {
        boolean temp; //arrange

        temp = prime(11); //act

        Assertions.assertTrue(temp); //assert
    }

}