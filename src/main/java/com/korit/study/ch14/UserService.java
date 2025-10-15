package com.korit.study.ch14;

public class UserService {

    UserList userList;

    public UserService(UserList userList) {
        this.userList = userList;
    }

    boolean isDuplicatedUsername(String username) {
        return userList.findByUsername(username) != null;
    }

    User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.username);
        if(foundUser == null) {
            return null;
        }
        if(!foundUser.password.equals(signinDto.password)) {
            return null;
        }
        return foundUser;
    }

    void signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.id = userList.generateUserId();
        userList.add(user);
    }

    void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회");
        for (User user : userList.users) {
            System.out.println(user.toString());
        }
    }


}
