package com.client;

public class Silver extends MembershipType {

    public Silver(int silverMembershipPoint) {
        if (silverMembershipPoint < 10) {
            System.out.println(silverMembershipPoint);
        } else {
            System.out.println("Not Silver");
        }

    }

}
