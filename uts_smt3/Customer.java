package uts_smt3;

public class Customer extends User {
    private boolean verificationStatus;

    public Customer(UserProfile userProfile) {
        super(userProfile);
        this.verificationStatus = false;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public String applyVerification(String doc) {
        if (doc.equals("jpg") || doc.equals("png") || doc.equals("pdf")) {
            verificationStatus = true;
            return "Verification successful for " + getName();
        } else {
            return "Invalid document type for " + getName();
        }
    }
}