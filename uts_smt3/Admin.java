package uts_smt3;

public class Admin extends User {
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public String adminLogin(int userId, String password) {
        if (userProfile.getUserId() == userId && userProfile.getPassword().equals(password) && userProfile.isAdmin()) {
            return "Admin Login successful as " + getName();
        } else {
            return "Admin Login failed: Unauthorized or incorrect credentials";
        }
    }

    public String updateVehicleDetails(String vehicleId) {
        return "Vehicle " + vehicleId + " updated by " + getName();
    }

    public String addVehicle(String vehicle) {
        return "Vehicle " + vehicle + " added by " + getName();
    }

    public String retrieveComplaint() {
        return "Complaint retrieved by " + getName();
    }

    public String verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            return "User " + customer.getName() + " verified by " + getName();
        } else {
            return "Verification needed for " + customer.getName();
        }
    }
}
