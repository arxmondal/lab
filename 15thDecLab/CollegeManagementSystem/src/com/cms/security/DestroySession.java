package com.cms.security;

// Importing necessary package
import com.cms.operations.StudentInfo;

public class DestroySession {
    public static void destroy() throws Exception {
        StudentInfo.setIsLoggedIn(false);
        StudentInfo.setStudentId(0);
        StudentInfo.setName(null);
        StudentInfo.setPhone(0L);
        StudentInfo.setPasswordHash(null);
        StudentInfo.setRecoveryKeyHash(null);
        StudentInfo.setPinHash(null);
        StudentInfo.setIsPinEnabled(false);
        System.out.println("You are logged out!");

    }
}
