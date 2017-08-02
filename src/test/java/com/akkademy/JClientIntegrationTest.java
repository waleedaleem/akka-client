package com.akkademy;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class JClientIntegrationTest {
    JClient client = new JClient("127.0.0.1:2552");

    @Before
    public void itShouldSetRecord() throws Exception {
        System.out.println("Running Test: itShouldSetRecord()");
        client.set("123", 123);
        Integer result = (Integer) ((CompletableFuture) client.get("123")).get();
        assert(result == 123);
    }

    @Test
    public void itShouldSetRecordIfAbsent() throws Exception {
        System.out.println("Running Test: itShouldSetRecordIfAbsent()");
        client.setIfAbsent("123", 789);
        Integer result = (Integer) ((CompletableFuture) client.get("123")).get();
        assert (result == 123);
        client.setIfAbsent("789", 789);
        result = (Integer) ((CompletableFuture) client.get("789")).get();
        assert (result == 789);
    }
}
