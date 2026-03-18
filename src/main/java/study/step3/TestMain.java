package com.bank.gugu.user;


import java.util.HashMap;
import java.util.Map;

public class TestMain {

    private static final String MASTER_KEY = "123456";
    private static final Map<String, User> userRepository = new HashMap<>();

    public static void main(String[] args) throws IllegalAccessException {
        init(); // 무시

        User user = authenticate(new LoginRequest("minseon1", "민선", "zxc123!@#"));

        System.out.println("user info : " + user.toString());
    }



    private static User authenticate(LoginRequest request) throws IllegalAccessException {
        User user = userRepository.get(request.userId());
        if (user != null && (request.isMasterKey(MASTER_KEY) || user.password().equals(request.password()))) {
            return user;
        }
        throw new IllegalAccessException();
    }


    /**
     * 무시
     */

    private static void init() {
        userRepository.put("minseon", new User("zxc123!@#", "aa@aa.aa"));
    }

    public record LoginRequest(
            String userId,
            String username,
            String password
    ) {

        public boolean isMasterKey(String masterKey) {
            return this.password.equals(masterKey);
        }
    }

    public record User(
            String password,
            String email
    ){

    }

}