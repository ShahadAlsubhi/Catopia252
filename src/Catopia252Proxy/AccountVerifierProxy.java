
package Catopia252Proxy;

public class AccountVerifierProxy implements AccountVerifier {
    private RealAccountVerifier realVerifier;

    public AccountVerifierProxy(RealAccountVerifier realVerifier) {
        this.realVerifier = realVerifier;
    }

    @Override
    public boolean verifyAccount(String username, String password) {
        // Additional checks before allowing the verification to proceed
        if (isValidUsername(username)) {
            return realVerifier.verifyAccount(username, password);
        } else {
            System.out.println("Invalid username: " + username);
            return false;
        }
    }

    private boolean isValidUsername(String username) {
        // Additional checks for valid username
        // checking if the username is not empty and meets certain criteria
        return username != null && !username.isEmpty() && username.matches("[a-zA-Z0-9]+");
    }
}
