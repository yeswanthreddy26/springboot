//package hero.sign_loginDto;
//
//import hero.enums.Role;
//
//public class SignupRequest {
//
//    private String username;
//    private String email;
//    private String password;
//    private String fullName;
//    private Role role;
//
//    public SignupRequest() {
//    }
//
//    public SignupRequest(String username, String email, String password, String fullName, Role role) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.fullName = fullName;
//        this.role = role;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public String getPhoneNumber() {
//        return getPhoneNumber();
//    }
//
//    public String getAddress() {
//        return getAddress();
//    }
//}

package hero.sign_loginDto;

import hero.enums.Role;

public class SignupRequest {

    private String username;
    private String email;
    private String password;
    private String fullName;
    private Role role;
    private String phoneNumber;
    private String address;

    public SignupRequest() {
    }

    public SignupRequest(String username, String email, String password, String fullName, Role role, String phoneNumber, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

