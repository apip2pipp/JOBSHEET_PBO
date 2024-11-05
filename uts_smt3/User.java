package uts_smt3;

public class User {
    protected UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String logIn(int userId, String password) {
        if (userProfile.getUserId() == userId && userProfile.getPassword().equals(password)) {
            return "Login successful as " + getName();
        } else {
            return "Login failed";
        }
    }

    public String recoverPassword() {
        return "Password recovery for " + userProfile.getEmailId();
    }

    public String logOut() {
        return getName() + " logged out";
    }

    public String getName() {
        return userProfile.getName();
    }
}
