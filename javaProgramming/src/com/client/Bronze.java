package com.client;

public class Bronze extends MembershipType{
    public Bronze (int bronzeMembershipPoint){
        if (bronzeMembershipPoint < 10) {
            System.out.println(bronzeMembershipPoint);
        } else {
            System.out.println("Not Bronze");
        }

    }
}
