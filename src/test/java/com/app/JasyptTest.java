package com.app;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptTest {

    @Test
    public void jasyptTest() {
        String password = "";

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setPoolSize(4);
        encryptor.setPassword(password);
        encryptor.setAlgorithm("PBEWithMD5AndTripleDES");

        String content = ""; //암호화 진행할 내용
        String encryptedContent = encryptor.encrypt(content);
        String decryptedContent = encryptor.decrypt(encryptedContent);
        System.out.println("암호화 : " + encryptedContent);
        System.out.println("복호화 : " + decryptedContent);
    }
}
